import java.util.Scanner;

public class BinaryDigit {


    // returns binary value of given positive decimal integer
    public static int binaryDigit(int decimal){
        int quotient = decimal;
        int remainder;
        StringBuilder result = new StringBuilder();


        while(quotient>=1){
            remainder = quotient % 2;
            result.append(remainder);
            quotient = quotient / 2; // main operation
        }

        return Integer.parseInt(result.reverse().toString());

        // Time complexity : O(log n)
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Type a number which convert to binary: ");
        int number = scan.nextInt();
        System.out.println(binaryDigit(number));

    }
}
