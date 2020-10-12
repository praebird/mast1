import java.util.Arrays;
import java.util.Scanner;

public class Arr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		int i;
		int t;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size:");
		t= sc.nextInt();
		arr=new int [t];
		
		System.out.println("Enter the array numbers:");
		for(i=0;i<t;i++) {
			
			arr[i]= sc.nextInt();
			
		}
		
		System.out.println("Reversed Array: ");
		for(i=t-1;i>=0;i--) {
			
			System.out.print(" "+arr[i]+" " );
			
			
		}
		sc.close();
	}

}
