import java.util.Scanner;

public class prntrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a ,b;
		
		//prntrange p= new prntrange();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start==");
		
		a=sc.nextInt();
		System.out.println("Enter end==");
		b=sc.nextInt();
		prntrange.range(a, b);
		sc.close();

	}

	
	public static void range(int a1,int b1) 
	
	{
		int i;
		
		if(a1<=b1) {
		for (i=a1;i<=b1;i++) {
			
			System.out.print(i+"  ");
		}
		}
		
		else {
			for (i=a1;i>=b1;i--) {
				
				System.out.print(i+"  ");
			}
		}
		
		
	}
}
