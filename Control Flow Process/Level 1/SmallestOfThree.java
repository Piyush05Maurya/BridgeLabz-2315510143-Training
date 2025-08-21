import java.util.*; public class SmallestOfThree{
 public static void main(String[] a){Scanner s=new Scanner(System.in);
 int x=s.nextInt(),y=s.nextInt(),z=s.nextInt();
 System.out.println("The first number is"+((x<y&&x<z)?" ":" not ")+"the smallest.");}}
