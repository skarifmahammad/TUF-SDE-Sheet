package Array_2;

public class Repeat_and_Missing_Number {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] arr) {
        int n = arr.length;
        int[] ans = new int[2];
        int[] ppp = new int[n];
        // for(int i=0; i<n; i++){
        // ppp[arr[i]]++;
        // }
        for (int i : arr) {
            ppp[i - 1]++;
        }
        for (int j = 1; j <= ppp.length; j++) {
            if (ppp[j - 1] > 1) {
                ans[0] = j;
            }
            if (ppp[j - 1] == 0) {
                ans[1] = j;
            }
        }
        return ans;
    }
}