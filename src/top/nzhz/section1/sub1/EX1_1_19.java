package exercise;
import edu.princeton.cs.algs4.*;

public class EX1_1_19
{

	public static void main(String[] args) 
	{
		// 方法过于缓慢，所有数据没有保存
//		for(int N=0; N<100; N++)
//		{
//			StdOut.println(N+" "+F(N));
//		}
		
		for(int N=0; N<100; N++)
		{
			StdOut.println(N+" "+F_new(N));
		}
	} 

	public static long F(int n)
	{
		if(n==0) 
			return 0;
		if(n==1) 
			return 1;
		return F(n-1)+F(n-2);
	}
	
	public static long F_new(int n)
	{
		long[] f= new long[n+1];
		return F_new(n,f);
	}
	
	public static long F_new(int n, long[] f)
	{
		if(f[n]==0)
		{
			if(n==1)
				f[n]=1;
			else if(n>0)
				f[n]=F_new(n-1,f)+F_new(n-2,f);
		}
			return f[n];
	}
	
}
