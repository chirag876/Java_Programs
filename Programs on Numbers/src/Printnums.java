class Printnums
{
    public static void main (String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner (System.in);
        System.out.print("enter value of n : ");
        int n = sc.nextInt();
        for (int i = 1; i<=n ; i++) // for printing numbers in reverse order use for (int i = 1; i<=n ; i--)
        {
            System.out.print (i + " ");
        }
    }
}

/* OUTPUT
enter value of n : 30
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30
 */