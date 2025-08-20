package first_Assign;
import java.util.*;

public class Kilo_Miles {
	
	static Scanner sc = new Scanner(System.in);
	
	static void kilometersToMiles() {
        System.out.print("Enter kilometers: ");
        double km = sc.nextDouble();
        System.out.println("Miles: " + (km * 0.621371));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kilometersToMiles();

	}

}
