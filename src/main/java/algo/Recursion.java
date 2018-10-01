package algo;


public class Recursion {
    public static int naiveFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return naiveFibonacci(n - 1) + naiveFibonacci(n - 2);
    }

    public static int withArrayFibonacci(int n) {
        int[] F = new int[n+1];
        F[0] = 0;
        F[1] = 1;
        for (int i = 2; i <= n; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }
        return F[n];
    }
}
