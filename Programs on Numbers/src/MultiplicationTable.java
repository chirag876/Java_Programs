public class MultiplicationTable
{
    public static void main(String[] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("enter value of n : ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
}
/* OUTPUT
enter value of n : 8
8 * 1 = 8
8 * 2 = 16
8 * 3 = 24
8 * 4 = 32
8 * 5 = 40
8 * 6 = 48
8 * 7 = 56
8 * 8 = 64
8 * 9 = 72
8 * 10 = 80
 */