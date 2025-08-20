package first_Assign;
import java.util.*;

public class Avg_Three {
	
	static Scanner sc = new Scanner(System.in);
	
	static void averageOfThree() {
        System.out.print("Enter three numbers: ");
        double n1 = sc.nextDouble(), n2 = sc.nextDouble(), n3 = sc.nextDouble();
        System.out.println("Average: " + ((n1 + n2 + n3) / 3));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		averageOfThree();

	}

}
