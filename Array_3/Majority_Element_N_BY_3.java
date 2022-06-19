package Array_3;

import java.util.*;

class Majority_Element_N_BY_3 {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
        }
        List<Integer> list = new ArrayList<>();
        int n = nums.length / 3;
        for (Map.Entry<Integer, Integer> hmap : map.entrySet()) {
            if (hmap.getValue() > n) {
                list.add(hmap.getKey());
            }
        }
        return list;
    }
}
// Space Complexity = O(n)
// Time Complexity = O(n)