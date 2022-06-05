package Array_1;

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxsum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxsum = Math.max(sum, maxsum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxsum;
    }
}
// Time Complexity - O(n)
// Space Complexity - O(1)