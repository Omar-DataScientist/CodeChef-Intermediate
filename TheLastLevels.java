import java.util.*;
import java.lang.*;
import java.io.*;

class TheLastLevels
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int time = x * y;

            int breaks;
            if (x % 3 == 0)
                breaks = (x / 3) - 1;
            else
                breaks = x / 3;

            time += breaks * z;
            System.out.println(time);
        }
    }
}