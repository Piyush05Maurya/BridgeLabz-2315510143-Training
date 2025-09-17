import java.util.Arrays;
import java.util.Scanner;

public class FactorsSummary {
    public static int[] findFactors(int n) {
        if (n <= 0) return new int[0];
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) factors[idx++] = i;
        return factors;
    }

    public static int sum(int[] arr) {
        int s = 0; for (int v : arr) s += v; return s;
    }

    public static long product(int[] arr) {
        long p = 1; for (int v : arr) p *= v; return p;
    }

    public static long sumOfSquares(int[] arr) {
        long s = 0; for (int v : arr) s += (long)v * v; return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        int[] factors = findFactors(n);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Sum: " + sum(factors));
        System.out.println("Product: " + product(factors));
        System.out.println("Sum of squares: " + sumOfSquares(factors));
        sc.close();
    }
}
