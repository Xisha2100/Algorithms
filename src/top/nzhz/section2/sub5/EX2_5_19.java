package top.nzhz.section2.sub5;

import edu.princeton.cs.algs4.StdRandom;

public class EX2_5_19 {
    
    //Kendall tau距离
    public static int getKendallTauDistance1(int[] a, int[] b){
        int[] aIndex = new int[a.length];
        int[] bIndex = new int[b.length];

        for (int i = 0; i < a.length; i++) {
            aIndex[a[i]]=i;
        }
        for (int i = 0; i < a.length; i++) {
            bIndex[i]=aIndex[b[i]];
        }

        int ans=0;
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j >0&&bIndex[j]<bIndex[j-1]; j--) {
                  int temp= bIndex[j];
                    bIndex[j]=bIndex[j-1];
                    bIndex[j-1]=temp;
                    ans++;
            }
        }
        return ans;
    }

    public static int getKendallTauDistance2(int[] a, int[] b){
        int[] aIndex = new int[a.length];
        int[] bIndex = new int[b.length];

        for (int i = 0; i < a.length; i++) {
            aIndex[a[i]]=i;
        }
        for (int i = 0; i < a.length; i++) {
            bIndex[i]=aIndex[b[i]];
        }

        return mergeCount(bIndex);
    }

    private static int mergeCount(int[] a){
        aux=new int[a.length];
        mergeSort(a,0,a.length-1);
        return count;
    }

    private static void mergeSort(int[] a,int left, int right){
        if(left>=right)return;
        int mid = left+(right-left)/2;
        mergeSort(a,left,mid);
        mergeSort(a,mid+1,right);
        merge(a,left,right,mid);
    }

    private static void merge(int[] a, int left, int right, int mid){
        int i=left,j=mid+1;

        for (int k = left; k <=right; k++) {
            aux[k]=a[k];
        }
        for (int k = left; k <=right; k++) {
            if(i>mid){
                a[k]=aux[j++];
            }else if(j>right){
                a[k]=aux[i++];
            }else if(aux[j]<aux[i]){
                a[k]=aux[j++];
                count+=j-k-1;
            }else {
                a[k]=aux[i++];
            }
        }
    }


    private static int[] aux;
    private static int count=0;

    public static void main(String[] args) {
        int n = 100;
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
            b[i] = i;
        }
        StdRandom.shuffle(a);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        StdRandom.shuffle(b);
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }

        System.out.println();
        System.out.println("distance1: " + getKendallTauDistance1(a, b));
        System.out.println("distance2: " + getKendallTauDistance2(a, b));
    }
}
