import java.util.*;
import java.lang.*;
import java.io.*;

class Cred_Coins
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int Y=sc.nextInt();
            int X=sc.nextInt();
            System.out.println(X*Y/100);
        }
    }
}
