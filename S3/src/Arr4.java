import java.util.Scanner;
import java.util.Arrays;

public class Arr4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		int i;
		int t;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size:");
		t= sc.nextInt();

		arr=new int [t];
		
		System.out.println("Enter "+ t +" numbers:");
		for(i=0;i<t;i++) {
			
			arr[i]= sc.nextInt();
			
		}
		
		Arrays.sort(arr);
		
		System.out.println("Sorted Array=="+Arrays.toString(arr));
		
		
		
		
		
		
		

}
}
