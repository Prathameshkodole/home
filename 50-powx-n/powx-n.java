class Solution {
    public double myPow(double x, int n) {
        // Base case
        if (x == 1 || n == 0) return 1.0;
        
        // Use long to safely hold Math.abs(Integer.MIN_VALUE) without overflow
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double result = 1.0;
        double currentBase = x;

        while (N > 0) {
            // If N is odd, multiply result by currentBase
            if (N % 2 == 1) {
                result *= currentBase;
            }
            // Square the base and halve the exponent
            currentBase *= currentBase;
            N /= 2;
        }

        return result;
    }
}