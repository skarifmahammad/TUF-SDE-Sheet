package Array_3;

class Solution {
    public double myPow(double x, int n) {
        // return Math.pow(x,n);
        if (x == 1 || n == 0) {
            return 1;
        }
        double res = 1;
        while (n != 0) {
            if (n % 2 != 0) {
                if (n > 0) {
                    res *= x;
                } else {
                    res /= x;
                }
            }
            n /= 2;
            x *= x;
        }
        return res;
    }
}