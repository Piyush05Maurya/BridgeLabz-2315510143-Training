import java.util.*; public class SumOfNaturalNumbers{
 public static void main(String[] a){Scanner s=new Scanner(System.in);
 int n=s.nextInt(); if(n>0){int sum=n*(n+1)/2; System.out.println("The sum of "+n+" natural numbers is "+sum);}
 else System.out.println("The number "+n+" is not a natural number");}}
