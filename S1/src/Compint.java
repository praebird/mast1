import java.util.Scanner;
import java.lang.Math;
//P (1 + r/n)^ (nt)
public class Compint {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	double c,j;

	System.out.println("Enter Amount:");
	double p = sc.nextDouble();
	System.out.println("Enter Rate of Interest:");
	double r = sc.nextDouble();
	
	System.out.println("Enter the number of times interest is compounded per time period:");
	double n= sc.nextDouble(); 

	System.out.println("Enter total number of years:");
	double t= sc.nextDouble();
	
	c=(p*(1+r/n));
	j=Math.pow(c, n*t);
	
	System.out.println("The Compound Interest is == "+j);
	sc.close();
	
	
	
	}
}
