package coursera;

import java.awt.Shape;
import java.util.Scanner;

public class Perimeter {
 int r,b,l,s1,s2,s3;
 double pi=3.14,perimeter;
 Scanner sc= new Scanner(System.in);

 void circle() {
     System.out.print("Enter radius of circle:");
     r = sc.nextInt();
     perimeter = 2 * pi * r;
     System.out.println("Perimeter of circle:"+perimeter);
 }
 
 void rectangle() {
	 System.out.println("\nEnter the length:");
	 l=sc.nextInt();
	 System.out.println("\nEnter the breadth:");
	 b=sc.nextInt();
	 perimeter=2*(l+b);
	 System.out.println("Perimeter of rectangle:"+perimeter);
 }
 void triangle() {
	 System.out.println("Enter the sides of triangle:");
	 s1=sc.nextInt();
	 s2=sc.nextInt();
	 s3=sc.nextInt();
	 perimeter=s1+s2+s3;
	 System.out.println("Perimeter of triangle:"+perimeter);
 }
 public static void main(String[] args)
 {
	 Perimeter obj=new Perimeter();
	 obj.circle();
	 obj.rectangle();
	 obj.triangle();
 }
}
