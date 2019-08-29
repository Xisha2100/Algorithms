package exercise;
import edu.princeton.cs.algs4.*;

public class EX1_1_22
{

	public static void main(String[] args) 
	{
		int[] a = {0,1,2,3,4,5,6,7,8,9};
		StdOut.print(rank(9,a));
	} 
	
	public static int rank(int key, int[] a)
	{
		return rank(key, a, 0, a.length-1, 0);
	}
	
	public static int rank(int key, int[] a, int lo, int hi, int n)
	{
		if(lo>hi)
			return -1;
		int mid = lo + (hi - lo) / 2;
		for(int i=0; i<n; i++)
			StdOut.print("	");
		StdOut.printf("%d\t%d\t\n", lo, hi);
		if(key < a[mid])
			return rank(key, a, 0, mid - 1, n+1);
		else if(key > a[mid])
			return rank(key, a, mid + 1, hi, n+1);
		else
			return mid;
	}
}
//