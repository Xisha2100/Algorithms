package top.nzhz.section1.sub1;

public class EX1_1_22
{
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 0);
    }

    public static int rank(int key, int[] a, int lo, int hi,int dep) {
        if (lo > hi) return -1;
        for (int i = 0; i < dep; i++) {
            System.out.printf(" ");
        }
        System.out.printf("%d %d \n",lo,hi);
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1,dep+1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi,dep+1);
        else return mid;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 12 };
        int key = 12;
        int pos = rank(key, a);
        if (pos == -1) {
            System.out.println("not found!");
        } else {
            System.out.println("position=" + pos);
        }
    }
}
