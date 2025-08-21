import java.util.*; public class SpringSeason{
 public static void main(String[] a){Scanner s=new Scanner(System.in);
 int m=s.nextInt(), d=s.nextInt();
 boolean spring=(m==3&&d>=20)||(m==4)||(m==5)||(m==6&&d<=20);
 System.out.println(spring?"Its a Spring Season":"Not a Spring Season");}}
