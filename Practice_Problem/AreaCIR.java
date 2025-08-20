package first_Assign;
import java.util.*;

public class AreaCIR {
	
	static Scanner sc  = new Scanner(System.in);
	
	static void areaOfCircle() {
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("Area of circle: " + (Math.PI * r * r));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		areaOfCircle();
	}

}
