import java.util.*;
import java.lang.*;
import java.io.*;

class ChefEren
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int time=0;
            if(n%2!=0)
                time=b+n/2*a+n/2*b;
            else
                time=n/2*a+n/2*b;
            System.out.println(time);
        }

    }
}
