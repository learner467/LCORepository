/**
 * Combination
 */
public class Combination {

    static int combi(int n, int r) {
        return (fact(n) / (fact(r) * fact(n - r)));
    }

    static int fact(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 5, r = 3;
        System.out.println(combi(n, r));
    }
}