/**
 * Power
 */
public class Power {

    public static void main(String[] args) {
        int base = 2;
        int exp = 3;
        int result = power(base, exp);
        System.out.println("Result is: " + result);
    }

    public static int power(int base, int exp) {
        if (exp != 0) {
            return (base * power(base, exp - 1));
        } else
            return 1;
    }
}