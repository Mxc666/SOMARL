python -m hipop --plan hadd-max --ol sorted --hadd hadd-reuse --domain ~/code/HTN_Planner/domains/movebox_task0/domain.hddl --problem ~/code/HTN_Planner/domains/movebox_task0/problem.hddl --actions_reward ~/code/HTN_Planner/intrinsic_reward/movebox_task0/action_reward_1.npy --methods_reward NONE 2>&1 | tee ~/code/MoveBox_task0/out/MoveBox_task0_1.out