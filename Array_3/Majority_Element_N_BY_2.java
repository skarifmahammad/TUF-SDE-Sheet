package Array_3;

import java.util.HashMap;

class Majority_Element_N_BY_2 {
    public int majorityElement(int[] nums) {
        // Moore's sorting algo
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (map.get(nums[j]) > nums.length / 2) {
                return nums[j];
            }
        }
        return -1;
    }
}

// Space Complexity = O(n)
// Time Complexity = O(n)