import java.util.Arrays;
import java.util.Scanner;

public class ArrayEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the Size of Array 1");
		int l1 = sc.nextInt();

		System.out.println("Enter the Size of Array 2");
		int l2 = sc.nextInt();
		
		int a1[]=new int[l1];

		int a2[]=new int[l2];
		
		
		if(l1 == l2) {
			System.out.println("Enter the elements of array 1==");
			for(int i=0;i<a1.length;i++) {
				
				a1[i]=sc.nextInt();
				
			}
			
			System.out.println("Enter the elements of array 2==");
			
			for(int i=0;i<a2.length;i++) {
				
				a2[i]=sc.nextInt();
				
			}
			Arrays.sort(a1);
			Arrays.sort(a2);
			
			
			if(Arrays.equals(a1, a2)) {
				System.out.println("Arrays are equal !");
			}
			else {

				System.out.println("Arrays are not equal !");
			}
			
			
		}
		else {
			
			System.out.println("Arrays cannot be equal as their sizes are different!!");
		}
	sc.close();	
	}
	

}
