package Array_2;

import java.util.*;

class Find_the_Duplicate_Number {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int num = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                num = nums[i];
                break;
            }
        }
        return num;
    }
}