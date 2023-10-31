python -m hipop --plan hadd-max --ol sorted --hadd hadd-reuse --domain ~/code/HTN_Planner/domains/movebox_task1/domain.hddl --problem ~/code/HTN_Planner/domains/movebox_task1/problem.hddl --actions_reward ~/code/HTN_Planner/intrinsic_reward/movebox_task1/action_reward_100.npy --methods_reward ~/code/HTN_Planner/intrinsic_reward/movebox_task1/method_reward_100.npy 2>&1 | tee ~/code/MoveBox_task1/out/movebox_task1_100.out