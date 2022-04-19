/**
 * Factorial
 */
public class Factorial {

    public static long myfact(int n) {
        if (n >= 1) {
            return n * myfact(n - 1);
        } else
            return 1;
    }

    public static void main(String[] args) {
        int num = 5;
        long factorial = myfact(num);
        System.out.println("Factorial is: " + factorial);
    }
}