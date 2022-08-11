import java.util.Scanner;

public class FactRange
{
    static int fact(int n)
    {
        int fact=1;
        while (n>0)
        {
            fact=fact*n;
            n--;
        }
        return fact;
    }
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the range of number : ");
        int k=scn.nextInt();
        for (int i=1;i<=k ;i++)
        {
            System.out.println(i+ "!----> " + fact(i));
        }
    }
}

/* OUTPUT
Enter the range of number : 8
1!----> 1
2!----> 2
3!----> 6
4!----> 24
5!----> 120
6!----> 720
7!----> 5040
8!----> 40320
 */