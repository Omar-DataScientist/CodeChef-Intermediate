import java.util.*;
import java.lang.*;
import java.io.*;

class Possible_Victory
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int o=sc.nextInt();
        int c=sc.nextInt();
        if((20-o)*6*6>r-c)
        System.out.println("YES");
        else
        System.out.println("NO");
	}
}
