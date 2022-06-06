package Array_2;

class Solution {
    public void rotate(int[][] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = i; j < ans[0].length; j++) {
                int temp = 0;
                temp = ans[i][j];
                ans[i][j] = ans[j][i];
                ans[j][i] = temp;
            }
        }
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length / 2; j++) {
                int temp = 0;
                temp = ans[i][j];
                ans[i][j] = ans[i][ans.length - 1 - j];
                ans[i][ans.length - 1 - j] = temp;
            }
        }
    }
}
// Time Complexity - O(n^2)
// Space Complexity - O(1)