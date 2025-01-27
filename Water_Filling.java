import java.util.*;
import java.lang.*;
import java.io.*;

class Water_Filling
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int b1=sc.nextInt();
            int b2=sc.nextInt();
            int b3=sc.nextInt();
            if(b1+b2+b3<2)
                System.out.println("Water Filling Time");
            else
                System.out.println("Not now");
        }
	}
}
