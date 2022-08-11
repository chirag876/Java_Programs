import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number : ");
        int n =sc.nextInt();
        int t=n;
        int rev=0;
        while (n!=0)
        {
            rev=rev*10+(n%10);
            n=n/10;
        }
        if (rev==t)
            System.out.println(t + " is a palindrome number");
        else
            System.out.println(t + " is not a palindrome number");
    }
}

/* OUTPUT
enter a number : 121
121 is a palindrome number
***************************
enter a number : 542
542 is not a palindrome number

 */