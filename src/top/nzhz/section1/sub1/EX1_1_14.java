package ty_pack;
import edu.princeton.cs.algs4.*; 

public class EX1_1_14
{
	public static void main(String[] args) 
	{
		int n;
		StdOut.println("input a num");
		n=StdIn.readInt();
		if(lg(n)==-1)
			StdOut.println("wrong filed");
		else
			StdOut.println(lg(n));
	}
	
	public static int lg(int N)
	{
		int i=-1;
		for(; N>0;i++)
		{
			N/=2;
		}
		return i;
	}	
}
