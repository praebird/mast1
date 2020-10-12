import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number to check:");
		int n =sc.nextInt();		
		int i;
		int t=0;
		sc.close();
		for(i=2;i<n-1;i++) {
			
			if(n % i==0) {
				
				t++;
				break;
			}
			
			
			else {
			
				t=0;
			}	
		}
		
		if(t>=1) {

			System.out.println("Prime Number");
		}
		
		else {

			System.out.println("Not a Prime Number");
		}
	}

}
