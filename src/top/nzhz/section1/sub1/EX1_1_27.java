package top.nzhz.section1.sub1;

import edu.princeton.cs.algs4.StdOut;

public class EX1_1_27 {
    private static double binomial(int N, int K, double p) {
        times++;
        if (N == 0 && K == 0) return 1.0;
        if (N < 0 || K < 0) return 0.0;
        if (!flag[N][K]) {
            dp[N][K] = (1.0 - p) * binomial(N - 1, K, p) + p * binomial(N - 1, K - 1, p);
            flag[N][K]=true;
        }
        return dp[N][K];
    }

    private static double[][] dp;
    private static boolean[][] flag;
    private static int times;

    public static void main(String[] args) {
        int N = 100, K = 50;
        dp = new double[N+1][K+1];
        flag=new boolean[N+1][K+1];
        times=0;
        StdOut.println(binomial(100, 50, 0.25));
        StdOut.println(times);
    }
}
