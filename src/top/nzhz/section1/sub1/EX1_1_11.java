package top.nzhz.section1.sub1;
import edu.princeton.cs.algs4.*; 

public class EX1_1_11
{
	public static void main(String[] args) 
	{
		boolean[][] a = new boolean[10][10];
		StdOut.print(" ");
		for(int i=0; i<10; i++)
			StdOut.print(" "+i);			
		StdOut.println();
		for(int i=0; i<10; i++)
		{
			StdOut.print(i);
			for(int j=0; j<10; j++)
			{				
				if(a[i][j]=StdRandom.bernoulli())
					StdOut.print(" *");
				else
					StdOut.print("  ");				
			}
			StdOut.println();	
		}
	}
}
