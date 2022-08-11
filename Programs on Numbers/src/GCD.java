import java.util.Scanner;

public class GCD
{
    static int gcd(int m ,int n)
    {
        if(m<n)
            return gcd(n ,m);
        if(n==0)
            return m;
        return gcd(n, m%n);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int a=gcd(p, q);
        System.out.println("The GCD of entered number is " + a + " ");
    }
}

//GCD = The Greatest Common Divisor

/* OUTPUT
Enter the two numbers : 90 120
The GCD of entered number is 30
 */

