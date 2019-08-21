package ty_pack;
import edu.princeton.cs.algs4.*; 

public class EX1_1_5
{
	public static void main(String[] args) 
	{
		double x, y;
		StdOut.println("Input x, y");
		x=StdIn.readDouble();
		y=StdIn.readDouble();
		if(between_num(x) &&between_num(y))
			StdOut.println("between");
		else
			StdOut.println("not between");
	}
	public static boolean between_num(double temp)
	{
		if(temp<1.0 && temp>0.0)
			return true;
		else
			return false;
	}
}
