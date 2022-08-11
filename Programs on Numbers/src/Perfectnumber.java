import java.util.Scanner;

public class Perfectnumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
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
        else
            System.out.println(num + " is not a Perfect number");
    }
}

/* Perfect number, a positive integer that is equal to the sum of its proper
divisors. The smallest perfect number is 6, which is the sum of 1, 2, and 3.*/

/* OUTPUT
Enter a number : 6
6 is a Perfect number
**********************************************
Enter a number : 100
100 is not a Perfect number
 */