import java.util.Scanner;
public class Armstrong
{
    public static void main(String[] args)
    {
        int num, number, temp, total = 0;
        System.out.print("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        scanner.close();
        number = num;
        for( ;number!=0;number /= 10)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
        }
        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}

/* An Armstrong number is an integer such that the sum of the power of its digits is
equal to the number itself.
For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
9 is an Armstrong number since 9*1= 9.*/

/* OUTPUT
Enter a number : 23
23 is not an Armstrong number
******************************
Enter a number : 153
153 is an Armstrong number
 */