package top.nzhz.section1.sub1;

import edu.princeton.cs.algs4.StdOut;

public class EX1_1_24 {
    private static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void main(String[] args) {
        StdOut.println(gcd(1111111,1234567));
    }
}
