import java.util.Scanner;
public class power {
	public static void main(String[] args) {
	
	
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Number1:");
	double t = sc.nextDouble();

	System.out.println("Enter the Number2:");
	double s = sc.nextDouble();
	sc.close();
	int i;
	
	double j=1;
	for (i=1;i<=s;i++) 
		
		j=j*t;
	System.out.println("Power:"+ j);	
	
	
	
	
	
}
}
