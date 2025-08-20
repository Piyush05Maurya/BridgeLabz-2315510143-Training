package first_Assign;
import java.util.* ;

public class PeriRECT {
	
	static Scanner sc =  new Scanner(System.in);
	
	static void perimeterOfRectangle() {
        System.out.print("Enter length and width of rectangle: ");
        double l = sc.nextDouble(), w = sc.nextDouble();
        System.out.println("Perimeter: " + (2 * (l + w)));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perimeterOfRectangle();
	}

}
