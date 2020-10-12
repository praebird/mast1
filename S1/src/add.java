import java.util.Scanner;
public class add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		

		System.out.println("Enter Number 1:");
		double i = sc.nextDouble();

		System.out.println("Enter Number 2:");
		double j = sc.nextDouble();
		
		sc.close();
		System.out.println("addition : "+(i+j) );
		
	}

}
