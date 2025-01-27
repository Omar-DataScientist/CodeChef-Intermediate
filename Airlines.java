import java.util.*;
import java.lang.*;
import java.io.*;

class Airlines
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int x=sc.nextInt();
		    int n=sc.nextInt();
		    if(x*100<n && n%100==0)
		    System.out.println((n-(x*100))/100);
		    else if(x*100<n && n%100!=0)
		    System.out.println(((n-(x*100))/100)+1);
		    else
		    System.out.println(0);
		}
	}
}
