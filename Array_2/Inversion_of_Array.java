package Array_2;

public class Inversion_of_Array {
    public static long getInversions(long arr[], int N) {
        // Write your code here.
        // long count = 0;
        // for(int i=0; i<n; i++){
        // for(int j=i+1; j<n; j++){
        // if(arr[i]>arr[j]){
        // count++;
        // }
        // }
        // }
        // return count;
        return sort(arr, 0, (int) N - 1);
    }

    static long sort(long[] arr, int l, int r) {

        long count = 0;
        if (l < r) {
            int m = l + (r - l) / 2;
            count += sort(arr, l, m);
            count += sort(arr, m + 1, r);
            count += merge(arr, l, m, r);
        }
        return count;
    }

    static long merge(long[] arr, int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        long left[] = new long[n1];
        long right[] = new long[n2];

        for (int i = 0; i < n1; ++i)
            left[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            right[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;
        long count = 0;
        while (i < n1 && j < n2) {

            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                count += n1 - i;
            }
        }
        while (i < n1)
            arr[k++] = left[i++];
        while (j < n2)
            arr[k++] = right[j++];

        return count;
    }
}
