import java.util.Scanner;
public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter X = ");
		double x =sc.nextDouble();

		System.out.println("Enter Y = ");
		double y =sc.nextDouble();
		
		System.out.println("Before Swapping X = "+ x + " and Y = " + y);
		
		swap.SwapNums(x, y);
		sc.close();
	}
	public static void SwapNums(double x1,double y1) {
		
		double temp;
		temp=x1;
		x1=y1;
		y1=temp;
		
		
		System.out.println("After Swapping X = "+ x1 + " and Y = " + y1);
		
		
	}
}
