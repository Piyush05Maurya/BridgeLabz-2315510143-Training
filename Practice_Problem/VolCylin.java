package first_Assign;
import java.util.* ;


public class VolCylin {
	
	static Scanner sc = new Scanner(System.in);
	
	static void volumeOfCylinder() {
        System.out.print("Enter radius and height of cylinder: ");
        double r = sc.nextDouble(), h = sc.nextDouble();
        System.out.println("Volume of cylinder: " + (Math.PI * r * r * h));
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		volumeOfCylinder();
	}

}
