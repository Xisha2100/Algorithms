package ty_pack;
import edu.princeton.cs.algs4.*; 
public class EX1_1_3
{
	public static void main(String[] args) 
	{
		int a, b, c;
		StdOut.println("Input 3 num");
		a=StdIn.readInt();
		b=StdIn.readInt();
		c=StdIn.readInt();
		if(a==b&&a==c)
			StdOut.println("equal");
		else
			StdOut.println("not equal");
	}
}
