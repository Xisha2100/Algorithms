package top.nzhz.section1.sub1;
import edu.princeton.cs.algs4.*; 

public class EX1_1_13
{
	public static void main(String[] args) 
	{
		int[][] a= new int[12][6];
		int[][] b= new int[6][12];
		for(int i=0; i<12; i++)
			for(int j=0; j<6; j++)
				a[i][j]=StdRandom.uniform(9999);
		b=exchange(a);
		print(a);
		print(b);
	}
	
	public static int[][] exchange(int[][] a)
	{
		int[][] b= new int[a[0].length][a.length];
		for(int i=0; i<a.length; i++)
			for(int j=0; j<a[0].length; j++)
				b[j][i]=a[i][j];
		return b;
	}
	
	public static void print(int[][] a)
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[0].length; j++)
				StdOut.printf("%4d ",a[i][j]);
			StdOut.println();
		}
	}	
}
