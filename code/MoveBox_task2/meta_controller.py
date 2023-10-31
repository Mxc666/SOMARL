import subprocess
from xml.sax.saxutils import prepare_input_source
import psutil
import numpy as np
import os


# input: state pairs, reward, Option set, sr;
# output: updated Option set, Action models
class SymbolicModel():

    # states pair
    # Note that: This list length equals to the Option Sets size
    def __init__(self, args, numStatepair=[]):
        super().__init__()

        self.args = args
        self.num_option = args.num_symOption  # the number of option
        self.num_agent = self.args.num_agents  # the number of agent

        # Input
        self.numStatepair = numStatepair  # [(numstate1,numstate2), ...] * num_agent

        # Output
        self.plan = []  # generate a plan



    # get the S2's num state, contains two agent
    def getS2numstate(self, option):
        return self.numStatepair[option][1]

    # choose symbolic option according the plan
    def choose_SymOption(self, plan_index):
        if len(self.plan) > plan_index:
            act = self.plan[plan_index]  # get the current action model
            act_index = act[1:]  # get act_i's "i"
            act_index = int(act_index)
            return act_index

    # generate numstate pairs
    def generateNumStatePairs(self):

        NUM_AGENT = 2
        # All state of Agents
        All_numstate = {1: [[1, 0, 0, 0, 0, 0, 0]] * NUM_AGENT,  # (r1 Free, r2 Free) - All free
                       2: [[0, 1, 0, 0, 0, 0, 0], [1, 0, 0, 0, 0, 0, 0]],  # (r1 Glued, r2 Free) - Single Glued Box
                       3: [[1, 0, 0, 0, 0, 0, 0], [0, 1, 0, 0, 0, 0, 0]],  # (r1 Free, r2 Glued) - Single Glued Box
                       4: [[0, 1, 1, 0, 0, 0, 0], [0, 1, 1, 0, 0, 0, 0]],  # (r1 Glued, r2 Glued) - TwoGlued, Holding
                       5: [[0, 1, 1, 0, 1, 0, 0], [0, 1, 1, 0, 1, 0, 0]],  # (r1 Glued, r2 Glued) - TwoGlued, Holding, NotKey, LeftMid
                       6: [[0, 1, 1, 1, 1, 0, 0], [0, 1, 1, 1, 1, 0, 0]],  # (r1 Glued, r2 Glued) - TwoGlued, Holding, Key, LeftMid
                       7: [[0, 1, 1, 1, 0, 1, 0], [0, 1, 1, 1, 0, 1, 0]],  # (r1 Glued, r2 Glued) - TwoGlued, Holding, Key, SecretMid
                       8: [[0, 0, 0, 0, 0, 0, 1]] * NUM_AGENT,  # (r1 Delivered, r2 Delivered) - Delivered
                       }
        need_list = [(1, 2), (1, 3), (1, 4), (2, 4), (3, 4), (4, 4), (4, 5), (4, 6), (4, 7), (5, 8), (6, 8), (7, 8)]  
        for per_pairs in need_list:
            numstate1_key = per_pairs[0]
            numstate2_key = per_pairs[1]
            numstate1 = All_numstate[numstate1_key]
            numstate2 = All_numstate[numstate2_key]
            self.numStatepair.append([numstate1, numstate2])
                    

    def generateReward(self, action_reward_dict, method_reward_dict, seed):

        np.save('../HTN_Planner/intrinsic_reward/movebox_task2/action_reward_' + seed +'.npy', action_reward_dict)
        np.save('../HTN_Planner/intrinsic_reward/movebox_task2/method_reward_' + seed +'.npy', method_reward_dict)
    
    
    # called Planner to generate plan, according to current domain file & problem file
    def generatePlan(self, seed):

        plan = []  # store plan
        flag = True

        # called planner to generate Planning
        _ = os.system('sh ../HTN_Planner/cmd_sh/MoveBox_task2_run_Seed_' + seed +'.sh')

        # update quality and plan
        if flag:  # flag means plan
            flag = False
            p = open('./out/movebox_task2_' + seed +'.out')  # result: plan

            # read result.out
            for i in p.readlines():
                        
                if i[:3] == "<==":
                    flag = False

                if flag:
                    # a = i[22:24]
                    a = i.split('->')[1].split('-')[0][1:]
                    plan.append(a)  # store action model name

                if i[:4] == "root":
                    flag = True

            plan = plan[::-1]
            plan = self.plan2Lower(plan)  # lower plan
            if len(plan) != 0:  # action models series
                self.plan = plan  # update plan
                print('find plan', self.plan)

    # lower plan
    def plan2Lower(self, plan):
        for i in range(len(plan)):
            plan[i] = plan[i].lower()
        return plan
    