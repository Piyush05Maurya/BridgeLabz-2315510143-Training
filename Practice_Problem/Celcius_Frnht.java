package first_Assign;
import java.util.* ;

public class Celcius_Frnht {
	
	static Scanner sc = new Scanner(System.in) ;
	
	static void celsiusToFahrenheit() {
        System.out.print("Enter Celsius: ");
        double c = sc.nextDouble();
        System.out.println("Fahrenheit: " + ((c * 9 / 5) + 32));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		celsiusToFahrenheit();
	}

}
