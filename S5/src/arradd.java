
import java.util.Scanner;

public class arradd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		int a,b;
		
		System.out.println("Enter the rows of matrix=");
		a=sc.nextInt();

		System.out.println("Enter the columns of matrix=");
		b=sc.nextInt();
		
		int arr1[][]=new int[a][b];
		int arr2[][]=new int[a][b];
		int arr3[][]=new int[a][b];
				
		System.out.println("Enter the "+ (a*b)  + " Numbers for array 1=");
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				
				arr1[i][j]=sc.nextInt();
			}
			
		}
		

		System.out.println("Enter the "+ (a*b)  +  " Numbers for array 2=");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				
				arr2[i][j]=sc.nextInt();
			}
			
		}
		
		

		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
			
		}
		System.out.println("Array after addition.....");
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				
				System.out.print((arr3[i][j]+"  "));
			}
			System.out.println();
		}
		
		//Arrays.toString(arr3);
		
		//System.out.println((arr3));
		

	}

}
