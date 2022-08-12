import java.util.*;
public class Bintodec
{
    public static void main(String[] args)
    {
        System.out.print("Enter the binary number : ");
        Scanner sc=new Scanner(System.in);
        long n =sc. nextLong();
        long dec=0;
        int count=0;
        while(n>0)
        {
            long r=n%10;
            dec=dec +r*pow(2,count);
            count++;
            n/=10;
        }
        System.out.println("decimal Equivalent : " + dec);
    }
    static int pow(int n, int p)
    {
        int pw=1;
        while(p>0)
        {
            pw=pw*n;
            p--;
        }
        return pw;
    }
}

//Convert Binary to Decimal in Java without using Integer.parseInt() method.

/* OUTPUT
Enter the binary number : 10001011
decimal Equivalent : 139
*/