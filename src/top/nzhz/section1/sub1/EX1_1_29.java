package top.nzhz.section1.sub1;

import edu.princeton.cs.algs4.StdOut;

public class EX1_1_29 {
    private static int rank(int key, int[] a) {
        int lo = 0, hi = a.length - 1,mid=0;
        while (lo < hi) {
            mid = lo + ( hi-lo) / 2;
            if (key > a[mid]) lo = mid+1;
//            else if(key<a[mid])hi = mid-1;
            else hi=mid;
        }
        return lo;
    }

    private static int count(int key,int[] a){
        int lo = rank(key,a), hi = a.length - 1,mid=0;
        int left=lo;
        while (lo<hi){
            mid=lo+( hi-lo+1) / 2;
            if(key<a[mid]) hi=mid-1;
            else lo=mid;
        }
        if(a[lo]==key)
        return lo-left+1;
        else return 0;
    }

    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,4,6,7,7,7,7,7,8,9,10};
        for (int i = 0; i < 12; i++) {
            int ans=count(i,a);
            StdOut.println(ans);
        }

    }
}
