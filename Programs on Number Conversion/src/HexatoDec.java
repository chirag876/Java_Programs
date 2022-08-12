import java.util.Scanner;
class HexatoDec
{
    public static void main(String[] args)
    {
        System.out.print("Enter the Hexadecimal number : ");
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        int dec = 0;
        int count = 0;
        int l = st.length();
        while(l>0)
        {
            int r=0;
            char ch=st.charAt(l-1);
            if(ch>=65 && ch<=70)
                r=ch-55;
            else if(ch>=97 && ch<=102)
                r=ch-87;
            else
                r=ch-48;
            dec=dec + r*pow(16,count);
            count++;
            l--;
        }
        System.out.println("Decimal Equivalent : " + dec);
    }
    static int pow(int n ,int p)
    {
        int pw=1;
        while(p>0)
        {
            pw=pw*n;
            p--;
        }
        return pw;
    }
}

/* OUTPUT
Enter the Hexadecimal number : 2fe
Decimal Equivalent : 766
*/