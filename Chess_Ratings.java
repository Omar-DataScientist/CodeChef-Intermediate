import java.util.*;
import java.lang.*;
import java.io.*;

class Chess_Ratings
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            if((y-x)%8==0)
            System.out.println((y-x)/8);
            else
            System.out.println((y-x)/8 + 1);
        }
	}
}