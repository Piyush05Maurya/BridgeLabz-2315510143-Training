import java.util.Random;
import java.util.Locale;

public class ZaraBonus {
    public static double[][] generateEmployees(int n) {
        Random r = new Random();
        double[][] emp = new double[n][3]; // salary, years, bonus
        for (int i=0;i<n;i++) {
            emp[i][0] = 10000 + r.nextInt(90000); // 5-digit base roughly 10000-99999
            emp[i][1] = r.nextInt(11); // years 0-10
            emp[i][2] = 0;
        }
        return emp;
    }

    public static double[][] computeNewSalaryAndBonus(double[][] emp) {
        for (int i=0;i<emp.length;i++) {
            double salary = emp[i][0];
            double years = emp[i][1];
            double bonusRate = years > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            emp[i][2] = bonus;
        }
        return emp;
    }

    public static void main(String[] args) {
        double[][] employees = generateEmployees(10);
        computeNewSalaryAndBonus(employees);
        double sumOld=0, sumNew=0, totalBonus=0;
        System.out.println("Index\tOldSalary\tYears\tBonus\tNewSalary");
        for (int i=0;i<employees.length;i++) {
            double oldS = employees[i][0];
            double years = employees[i][1];
            double bonus = employees[i][2];
            double newS = oldS + bonus;
            sumOld += oldS; sumNew += newS; totalBonus += bonus;
            System.out.printf("%d\t%.2f\t\t%.0f\t%.2f\t%.2f%n", i+1, oldS, years, bonus, newS);
        }
        System.out.printf("Sum Old: %.2f, Sum New: %.2f, Total Bonus: %.2f%n", sumOld, sumNew, totalBonus);
    }
}
