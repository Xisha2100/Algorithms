package ty_pack;
import edu.princeton.cs.algs4.*; 

public class EX1_1_15
{
	public static void main(String[] args) 
	{
		int m=5; 
		int[] a=new int[300];
		int[] b=new int[m];
		for(int i=0; i<300; i++)
			a[i]=StdRandom.uniform(m);
		b=histogram(a, m);
		for(int i=0;i<5;i++)
			StdOut.printf("%3d",b[i]);
	}
	
	public static int[] histogram(int[] a, int m)
	{
		int[] b= new int[m];
		for(int i=0; i<a.length;i++)
		{
			if(a[i]<m)
				b[a[i]]+=1;
		}
		return b;
	}	
}
