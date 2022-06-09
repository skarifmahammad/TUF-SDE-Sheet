package Array_2;

public class Find_duplicate_double {
    int[] findTwoElement(int arr[], int n) {
        // code here
        // int min=1;
        // Arrays.sort(arr);
        // int[] ans = new int[2];
        // for(int i=1; i<n; i++){
        // if(arr[i-1]==arr[i]){
        // ans[0] = arr[i];
        // }
        // }
        // Set<Integer> set = new HashSet<Integer>();
        // for(int j=0; j<n; j++){
        // set.add(arr[j]);
        // }
        // for(int j=0; j<n; j++){
        // if(!set.contains(min)){
        // ans[1] = min;
        // break;
        // }
        // else
        // min++;
        // }
        // return ans;

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