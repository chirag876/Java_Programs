import java.util.*;
public class Dectooct
{
    public static void main(String[] args)
    {
        System.out.print("Enter the decimal number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String oct="";
        while(n>0)
        {
            int r=n%8;
            oct= r + oct;
            n=n/8;
        }
        System.out.println("Octal Equivalent : " + oct);
    }
}

/* OUTPUT
Enter the decimal number : 8923
Octal Equivalent : 21333
 */