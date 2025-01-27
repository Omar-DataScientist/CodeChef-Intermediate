import java.util.*;
import java.lang.*;
import java.io.*;

class Pass_Fail
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int p=sc.nextInt();
            if(x*3-(n-x)>=p)
            System.out.println("PASS");
            else
            System.out.println("FAIL");
        }
	}
}