package first_Assign;

import java.util.* ;

public class Assignment {
	
	static Scanner sc = new Scanner(System.in);
	
	static void welcome() {
        System.out.println("Welcome to Bridgelabz!");
    }

    static void celsiusToFahrenheit() {
        System.out.print("Enter Celsius: ");
        double c = sc.nextDouble();
        System.out.println("Fahrenheit: " + ((c * 9 / 5) + 32));
    }
    
    static void areaOfCircle() {
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("Area of circle: " + (Math.PI * r * r));
    }

    static void volumeOfCylinder() {
        System.out.print("Enter radius and height of cylinder: ");
        double r = sc.nextDouble(), h = sc.nextDouble();
        System.out.println("Volume of cylinder: " + (Math.PI * r * r * h));
    }

    static void simpleInterest() {
        System.out.print("Enter Principal, Rate, Time: ");
        double p = sc.nextDouble(), rate = sc.nextDouble(), t = sc.nextDouble();
        System.out.println("Simple Interest: " + ((p * rate * t) / 100));
    }
    
    static void perimeterOfRectangle() {
        System.out.print("Enter length and width of rectangle: ");
        double l = sc.nextDouble(), w = sc.nextDouble();
        System.out.println("Perimeter: " + (2 * (l + w)));
    }

    static void powerCalculation() {
        System.out.print("Enter base and exponent: ");
        double base = sc.nextDouble(), exp = sc.nextDouble();
        System.out.println("Power: " + Math.pow(base, exp));
    }

    static void averageOfThree() {
        System.out.print("Enter three numbers: ");
        double n1 = sc.nextDouble(), n2 = sc.nextDouble(), n3 = sc.nextDouble();
        System.out.println("Average: " + ((n1 + n2 + n3) / 3));
    }

    static void kilometersToMiles() {
        System.out.print("Enter kilometers: ");
        double km = sc.nextDouble();
        System.out.println("Miles: " + (km * 0.621371));
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		welcome();
		
        celsiusToFahrenheit();
        areaOfCircle();
        volumeOfCylinder();
        simpleInterest();
        perimeterOfRectangle();
        powerCalculation();
        averageOfThree();
        kilometersToMiles();
        sc.close();
	}

}
