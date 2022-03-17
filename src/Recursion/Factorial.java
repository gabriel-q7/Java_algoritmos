package Recursion;

public class Factorial {

    static int factorial_v1(int n) {
        if (n == 1) return 1;
        return n*factorial_v1(n-1);
    }

    /**
     * Factorial method using Tail recursion.
     * @param n integer of the factorial
     * @param result accumulator
     * @return the result
     */
    static int factorial_v2(int n, int result) {
        if (n == 0) return result;
        return factorial_v2(n-1, n*result);
    }

    public static void main(String[] args) {
        System.out.println(factorial_v1(5));

        System.out.println(factorial_v2(5, 1));
    }
}
