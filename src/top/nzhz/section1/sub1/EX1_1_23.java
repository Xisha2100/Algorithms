package top.nzhz.section1.sub1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class EX1_1_23 {

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    public static int rank(int key, int[] a, int lo, int hi) {
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi);
        else return mid;
    }

    public static void main(String[] args) {
        In fileIn = new In("algs4-data/largeW.txt");
        int[] whiteList=fileIn.readAllInts();
        Arrays.sort(whiteList);
        while (true){
            int key= StdIn.readInt();
            StdIn.readChar();
            char con=StdIn.readChar();
            if(con=='+'&&rank(key,whiteList)==-1)
                StdOut.println("+"+key);
            else if(con=='-'&&rank(key,whiteList)>=0){
                StdOut.println("-"+key);
            }

        }
    }
}
