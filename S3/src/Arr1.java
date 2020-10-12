import java.util.*;
public class Arr1 {
	
	public static void main(String[] args) {
	
	int arr[];
	int i;
	int t;
	double m;
	double z=0.0;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the array size:");
	t= sc.nextInt();
	arr=new int[t];
	System.out.println("Enter the array numbers:");
	for(i=0;i<t;i++) {
		
		arr[i]= sc.nextInt();
		
	}
	
	
	for(i=0;i<t;i++) {
		
		z=z+arr[i];
		
	}
		m = (z/t);
		
		System.out.println("Average of array=" + m);
		
	
	
	sc.close();
	
	
	}
}
