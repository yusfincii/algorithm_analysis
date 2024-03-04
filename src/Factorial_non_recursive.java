public class Factorial_non_recursive {

    // returns the factorial of a given number with loop
    public static int factorial(int num){
        int result = 1;
        for(int i=num; i>0; i--){
            // main operator
            result *= i;
        }
        return result;

    // Time complexity : O(n)xx
    }

    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(factorial(10));
    }
}
