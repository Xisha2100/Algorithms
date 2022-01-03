package top.nzhz.section1.sub1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.Arrays;

public class EX1_1_28 {
    public static void main(String[] args) {
        In fileIn = new In("algs4-data/tinyT.txt");
        int[] whiteList=fileIn.readAllInts();
        Arrays.sort(whiteList);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(whiteList[0]);
        for (int i = 1; i < whiteList.length; i++) {
            if(whiteList[i]==whiteList[i-1]){
                continue;
            }
            list.add(whiteList[i]);
        }
        whiteList=list.stream().mapToInt(i->i).toArray();
        StdOut.println();
    }
}
