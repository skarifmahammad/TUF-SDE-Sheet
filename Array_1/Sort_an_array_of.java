package Array_1;

class Sort_an_array_of {
    public void sortColors(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) { // Bubble sort algorithm
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
// Time Complexity - O(n^2)
// Space Complexity - O(1)