package top.nzhz.section1.sub1;

import edu.princeton.cs.algs4.StdOut;

public class EX1_1_30 {
    private static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void main(String[] args) {
        int N = 50;
        boolean[][] a = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                if(gcd(i+1,j+1)>1) {
                    a[i][j]=true;
                    a[j][i]=true;
                }
            }
        }
        StdOut.println();
    }
}
