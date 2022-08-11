import java.util.Scanner;

public class StrongNumber
{
    static int fact(int n)
    {
        int fact=1;
        while (n>0)
        {
            fact= fact*n;
            n--;
        }
        return fact;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n =sc.nextInt();
        int num=n;
        int sum=0;
        int t=num;
        while (num!=0)
        {
            int r=num%10;
            sum=sum + fact(r);
            num=num/10;
        }
        if (sum==t)
            System.out.println(t + " is a strong number");
        else
            System.out.println(t + " not a strong number");

    }
}
/*Strong numbers are the numbers whose sum of factorial of digits = to the original number.
Example: 145 is a strong number.*/

/* OUTPUT
Enter a number : 78
78 not a strong number
***********************
Enter a number : 145
145 is a strong number
 */

