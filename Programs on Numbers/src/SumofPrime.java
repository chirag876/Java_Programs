import java.util.Scanner;
public class SumofPrime
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Find sum of prime numbers upto : ");
        int upto = scanner.nextInt();
        int sum = 0;
        for(int num = 2; num <= upto; num++)
        {
            int i;
            for(i = 2; i <= (num / 2); i++)
            {
                if(num % i == 0)
                {
                    i = num;
                    break;
                }
            }
            if(i != num) // If the number is prime then add it.
            {
                sum += num;
            }
        }
        System.out.println("\nSum of all prime numbers upto " + upto + " : " + sum);
    }
}

/* OUTPUT
Find sum of prime numbers upto : 100

Sum of all prime numbers upto 100 : 1058
 */