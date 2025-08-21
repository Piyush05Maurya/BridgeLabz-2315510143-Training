import java.util.*; public class LargestOfThree{
 public static void main(String[] a){Scanner s=new Scanner(System.in);
 int x=s.nextInt(),y=s.nextInt(),z=s.nextInt();
 System.out.println("Is the first number the largest? "+(x>=y&&x>=z));
 System.out.println("Is the second number the largest? "+(y>=x&&y>=z));
 System.out.println("Is the third number the largest? "+(z>=x&&z>=y));}}
