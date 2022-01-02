package ty_pack;
import edu.princeton.cs.algs4.*; 

public class EX1_1_9
{
	public static void main(String[] args) 
	{
		int n = 0;
		n=StdIn.readInt();		
		StdOut.println(d2bs(n));
	}
	
	public static String d2bs(int n)
	{
		String s="";
		for(;n>0;n/=2)
			s=(n%2)+s;
		return s;
	}
}
