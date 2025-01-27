import java.util.*;
import java.lang.*;
import java.io.*;

class Speed_LimTest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int a=sc.nextInt();
		    int x=sc.nextInt();
		    int b=sc.nextInt();
		    int y=sc.nextInt();
		    int sa=a*y;
		    int sb=b*x;
		    if(sa>sb)
		    System.out.println("Alice");
		    else if(sb>sa)
		    System.out.println("Bob");
		    else
		    System.out.println("EQUAL");
		}

	}
}
