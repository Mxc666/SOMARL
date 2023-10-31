python -m hipop --plan hadd-max --ol sorted --hadd hadd-reuse --domain ~/code/HTN_Planner/domains/FindTreasure/domain.hddl --problem ~/code/HTN_Planner/domains/FindTreasure/problem.hddl --actions_reward ~/code/HTN_Planner/intrinsic_reward/FindTreasure_NonIntrinsic/action_reward_100.npy --methods_reward NONE 2>&1 | tee ~/code/FindTreasure_NonIntrinsic/out/FindTreasure_NonIntrinsic_100.out