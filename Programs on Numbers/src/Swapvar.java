import java.util.Scanner;

public class Swapvar
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number (i) : ");
        int i= sc.nextInt();
        System.out.print("Enter 2nd number (j) : ");
        int j=sc.nextInt();
        int k;
        k=i;
        i=j;
        j=k;
        System.out.println("i = " +i);
        System.out.println("j = " +j);
    }
}

// Swapping two numbers using 3rd variable

/* OUTPUT
Enter 1st number (i) : 10
Enter 2nd number (j) : 20
i = 20
j = 10
*/


