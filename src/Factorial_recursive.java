public class Factorial_recursive {

    // returns the factorial of a given number with recursive method
    public static int factorial(int num){
        if(num == 0){
            return 1;
        }
        // main operator
        return num * factorial(num-1); // recursive

        // Time complexity : O(n)
    }

    public static void main(String[] args) {
        System.out.println(factorial(6));
        System.out.println(factorial(12));
    }
}
