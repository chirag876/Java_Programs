import java.util.Scanner;

public class BinaryToDecimal
{
    public static void main(String args[]){
        Scanner input = new Scanner( System.in );
        System.out.print("Enter a binary number: ");
        String binaryString =input.nextLine();
        System.out.println("Output: "+Integer.parseInt(binaryString,2));
    }
}

// Binary to Decimal conversion using Integer.parseInt() method

/* OUTPUT
Enter a binary number: 1001011
Output: 75
*/
