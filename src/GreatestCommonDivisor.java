import java.util.Scanner;

public class GreatestCommonDivisor {

    // returns great common divisor of given two number
    public static int greatestCommonDivisorFunc(int m, int n){
        int x = n;
        if(x!=0){
            x = m % n;
            m = n;
            n = x;
            // recursive
            return greatestCommonDivisorFunc(m, n); // main operator
        }
        return m;

        // Time complexity : O(log(min(num1, num2)))
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Num1: ");
        int num1 = scan.nextInt();

        System.out.print("Num2: ");
        int num2 = scan.nextInt();

        System.out.println(greatestCommonDivisorFunc(num1, num2));



    }
}
