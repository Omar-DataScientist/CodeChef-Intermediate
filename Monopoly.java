import java.util.*;
import java.lang.*;
import java.io.*;

class Monopoly
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int p=sc.nextInt();
		    int q=sc.nextInt();
		    int r=sc.nextInt();
		    int s=sc.nextInt();
		    int sum=p+q+r+s;
		    if(sum-p<p || sum-q<q || sum-r<r || sum-s<s)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
