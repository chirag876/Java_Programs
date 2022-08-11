class Prime
{
    public static void main (String [] args)
    {
        java.util.Scanner sc=new java.util.Scanner (System.in);
        System.out.print("enter number : ");
        int n=sc.nextInt ();
        System.out.println ("Prime numbers between 1 and " + n);
        for (int i=1; i < n; i++) //loop through the numbers one by one
        {
            boolean isPrime = true; //check to see if the number is prime
            for (int j=2; j < i ; j++)
            {
                if (i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.print (i + " ");
        }
    }
}

/* OUTPUT
enter number : 30
Prime numbers between 1 and 30
1 2 3 5 7 11 13 17 19 23 29
 */