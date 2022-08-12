import java.util.*;
public class Dectohex
{
    public static void main(String[] args)
    {
        System.out.print("Enter the decimal number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String hex="";
        while(n>0)
        {
            int r=n%16;
            switch (r)
            {
                case 10: hex='A'+ hex;
                    break;
                case 11: hex='B'+ hex;
                    break;
                case 12: hex='C'+ hex;
                    break;
                case 13: hex='D'+ hex;
                    break;
                case 14: hex='E'+ hex;
                    break;
                case 15: hex='F'+ hex;
                    break;
                default: hex=r + hex;
                    break;
            }
            n=n/16;
        }
        System.out.println("Hexadecimal Equivalent : " + hex);
    }
}

/* OUTPUT
Enter the decimal number : 234
Hexadecimal Equivalent : EA
 */