class Solution {
    int[][] dp;
    int offset;

    public int solve(int[] nums, int target, int index) {

        if(index == 0) {
            if(target == nums[0] && target == -nums[0]) {
                return 2;
            }

            if(target == nums[0] || target == -nums[0]) {
                return 1;
            }

            return 0;
        }

        if(target + offset < 0 || target + offset >= dp[0].length) {
            return 0;
        }

        if(dp[index][target + offset] != -1) {
            return dp[index][target + offset];
        }

        int plus = solve(nums, target - nums[index], index - 1);

        int minus = solve(nums, target + nums[index], index - 1);

        return dp[index][target + offset] = plus + minus;
    }

    public int findTargetSumWays(int[] nums, int target) {

        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        if(target > sum || target < -sum) {
            return 0;
        }

        offset = sum;

        dp = new int[nums.length][2 * sum + 1];

        for(int i = 0; i < nums.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(nums, target, nums.length - 1);
    }
}