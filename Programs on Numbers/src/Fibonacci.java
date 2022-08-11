import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the range : ");
        int range=scn.nextInt();
        int a=0;
        int b=1;
        int c=0;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 2; i <=range; i++)
        {
            c=a + b;

            if(c<=range)
            {
                System.out.print(c + " "); //c = a + b;
                a=b;
                b=c;
            }
        }
    }
}

/*a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding
numbers. The simplest is the series 1, 1, 2, 3, 5, 8, etc.*/

/* OUTPUT
Enter the range : 100
0 1 1 2 3 5 8 13 21 34 55 89
*/