import java.util.Scanner;

public class RangePerfectNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number : ");
        int n=sc.nextInt();
        for(int num=1;num<=n; num++)
        {
            int sum=1;
            for (int i=2;i<=num/2;i++ )
            {
                if (num%i==0)
                    sum=sum+i;
            }
            if (sum==num)
            {
                System.out.println(num + " is a Perfect number");
            }
        }
    }
}

/* OUTPUT
enter a number : 1000
1 is a Perfect number
6 is a Perfect number
28 is a Perfect number
496 is a Perfect number
 */