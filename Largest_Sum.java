import java.util.Scanner;

public class Largest_Sum 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) 
        {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int l1=0;
            int l2=0;
            for(int i=0;i<n;i++)
            {
                if(a[i]>l1)
                {
                    l2=l1;
                    l1=a[i];
                }
                else if(a[i]>l2 && a[i]!=l1)
                l2=a[i];
            }
            System.out.println(l1+l2);
        }
    }
}
