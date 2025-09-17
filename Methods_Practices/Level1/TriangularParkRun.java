import java.util.Scanner;

public class TriangularParkRun {
    public static int calculateRounds(double side1, double side2, double side3, double distance) {
        double perimeter = side1 + side2 + side3;
        return (int)Math.ceil(distance / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1 (m): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side2 (m): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side3 (m): ");
        double side3 = sc.nextDouble();

        int rounds = calculateRounds(side1, side2, side3, 5000);
        System.out.println("Athlete must complete " + rounds + " rounds to run 5 km.");
        sc.close();
    }
}