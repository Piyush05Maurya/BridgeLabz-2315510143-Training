import java.util.Scanner;

public class SumNaturalRecursive {
    public static int sumRec(int n) {
        if (n <= 0) return 0;
        return n + sumRec(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number n: ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Please enter a natural number >= 1");
            sc.close();
            return;
        }
        int r = sumRec(n);
        int f = sumFormula(n);
        System.out.println("Sum by recursion: " + r);
        System.out.println("Sum by formula: " + f);
        System.out.println("Equal? " + (r == f));
        sc.close();
    }
}
