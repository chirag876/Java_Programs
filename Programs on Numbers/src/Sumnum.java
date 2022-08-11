class Sumnum
{
    public static void main(String[] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("enter value of n : ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n ;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}

/* OUTPUT
enter value of n : 3
6
 */