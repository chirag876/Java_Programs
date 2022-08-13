import java.util.Scanner;
class NumDiamond
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        n = (n+1)/2;
        for (int i=0;i<n ;i++ )
        {
            for (int j=0;j<n-1-i ;j++ )
            {
                System.out.print(" ");
            }
            int k=1;
            for (int j=0;j<2*i+1 ;j++ )
            {
                System.out.print(""+k);
                if (j<(2*i+1)/2)
                    k++;
                else
                    k--;
            }
            System.out.println();
        }
        n = n-1;
        for (int i=0;i<n ;i++ )
        {
            for (int j=0;j<=i ;j++ )
            {
                System.out.print(" ");
            }
            int k=1;
            for (int j=0;j<2*(n-i)-1 ;j++ )
            {
                System.out.print(""+k);
                if (j<(2*(n-i)-1)/2)
                    k++;
                else
                    k--;
            }
            System.out.println();
        }
    }
}

/* OUTPUT
Enter the value of n : 10
    1
   121
  12321
 1234321
123454321
 1234321
  12321
   121
    1
 */