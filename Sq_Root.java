import java.util.*;
import java.lang.*;
import java.io.*;

class Sq_Root
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int x=sc.nextInt();
		    System.out.println(Math.round(Math.sqrt(x)));
		}

	}
}
