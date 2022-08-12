import java.util.*;
public class DectoAll
{
    public static void main(String[] args)
    {
        System.out.print("enter the number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("enter the base : ");
        int ba=sc.nextInt();
        System.out.println(ba + " base equivalent " + Convert(n, ba));
    }
    static String Convert(int num, int base)
    {
        String st="0123456789ABCDEF";
        String b="";
        while(num>0)
        {
            int r= num % base;
            b=st.charAt(r)+b;
            num=num/base;
        }
        return b;
    }
}

// Decimal to other number bases

/* OUTPUT
enter the number : 678
enter the base : 16
16 base equivalent 2A6
****************************
enter the number : 678
enter the base : 8
8 base equivalent 1246
****************************
enter the number : 678
enter the base : 2
2 base equivalent 1010100110

 */