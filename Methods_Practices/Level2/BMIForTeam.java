import java.util.Scanner;
import java.util.Locale;

public class BMIForTeam {
    public static double computeBMI(double weightKg, double heightCm) {
        double h = heightCm / 100.0;
        if (h <= 0) return 0;
        return weightKg / (h * h);
    }

    public static String statusForBMI(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double[][] data = new double[10][3]; // weight, height(cm), bmi
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i+1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i+1) + ": ");
            data[i][1] = sc.nextDouble();
            data[i][2] = computeBMI(data[i][0], data[i][1]);
        }
        System.out.println("Index\tWeight\tHeight\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t%.1f\t%.2f\t%s%n", i+1, data[i][0], data[i][1], data[i][2], statusForBMI(data[i][2]));
        }
        sc.close();
    }
}
