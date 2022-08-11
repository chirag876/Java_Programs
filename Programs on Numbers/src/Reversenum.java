import java.util.Scanner;

public class Reversenum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        int t=num;
        int rev=0;
        while(num!=0)
        {
            rev = rev*10+(num%10);
            num = num/10;
        }
        System.out.println("The reverse number is " + rev);
    }
}

/* OUTPUT
Enter the number : 98348934
The reverse number is 43984389
*/