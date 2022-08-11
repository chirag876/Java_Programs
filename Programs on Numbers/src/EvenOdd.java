class EvenOdd
{
    public static void main(String[] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("enter the num : ");
        int n=sc.nextInt();
        if(n%2==0)
            System.out.println(n + " is even");
        else
            System.out.println(n + " is odd");

    }
}

/* OUTPUT
enter the num : 34
34 is even
****************************
enter the num : 35
35 is odd

 */
