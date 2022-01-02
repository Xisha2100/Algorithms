package top.nzhz.section1.sub1;
import edu.princeton.cs.algs4.*;

public class EX1_1_20
{

	public static void main(String[] args) 
	{
		int N=3;
		StdOut.println(lge(N));
		
	} 

	public static double lge(int n)
	{
		if(n>1)
			return Math.log(n) + lge(n-1);
		else
			return 0;
	}

}
