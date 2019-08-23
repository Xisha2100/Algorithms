package exercise;
import edu.princeton.cs.algs4.*;

public class EX1_1_21
{

	public static void main(String[] args) 
	{
		int M=0;
		int i=1;
		int j;
		String []a=new String[i];
		while(M<i)
			a[M++]=StdIn.readLine();
		for(j=0;j<a.length;j++)
		{
			String[]b=a[j].split("\\s+");
			double temp=Double.parseDouble(b[1])/Double.parseDouble(b[2]);
			StdOut.printf("%s    %s    %s    %.3f\n",b[0],b[1],b[2],temp);
		}

	} 

}
