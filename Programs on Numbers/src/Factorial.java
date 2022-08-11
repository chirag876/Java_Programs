import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("enter the number : ");
        int n=scn.nextInt();
        int fact=1;
        for (int i=1;i<=n ;i++ )
        {
            fact=fact*i;
        }
        System.out.println("Factorial of entered number is " + fact);
    }
}

/* OUTPUT
enter the number : 5
Factorial of entered number is 120
 */
