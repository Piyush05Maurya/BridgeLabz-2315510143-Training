package first_Assign;
import java.util.* ;

public class SimpINT {
	
	static Scanner sc = new Scanner(System.in);
	
	static void simpleInterest() {
        System.out.print("Enter Principal, Rate, Time: ");
        double p = sc.nextDouble(), rate = sc.nextDouble(), t = sc.nextDouble();
        System.out.println("Simple Interest: " + ((p * rate * t) / 100));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simpleInterest();
	}

}
