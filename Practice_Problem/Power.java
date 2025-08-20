package first_Assign;
import java.util.*;

public class Power {
	
	static Scanner sc = new Scanner(System.in);
	
	static void powerCalculation() {
        System.out.print("Enter base and exponent: ");
        double base = sc.nextDouble(), exp = sc.nextDouble();
        System.out.println("Power: " + Math.pow(base, exp));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		powerCalculation();

	}

}
