import java.util.Scanner;

public class ArrayPosEvenCompare {
    public static boolean isPositive(int n) { return n >= 0; }
    public static boolean isEven(int n) { return n % 2 == 0; }
    public static int compare(int a, int b) { return Integer.compare(a, b); } // 1,0,-1 mapping can be used

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        for (int v : arr) {
            if (!isPositive(v)) System.out.println(v + " is Negative");
            else {
                System.out.println(v + " is Positive and " + (isEven(v) ? "Even" : "Odd"));
            }
        }
        int cmp = compare(arr[0], arr[4]);
        if (cmp > 0) System.out.println("First element > Last element");
        else if (cmp == 0) System.out.println("First element = Last element");
        else System.out.println("First element < Last element");
        sc.close();
    }
}
