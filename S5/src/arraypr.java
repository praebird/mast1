/*Write a method called append that accepts two integer arrays as parameters and returns 
a new array that contains the result of appending the second array's values at the end
 of the first array. 

For example, i
f arrays list1 and list2 store {2, 4, 6} and {1, 2, 3, 4, 5} respectively,
 the call of append(list1, list2) should return a new array containing {2, 4, 6, 1, 2, 3, 4, 5}. 
If the call instead had been append(list2, list1), the method would return an array containing {1, 2, 3, 4, 5, 2, 4, 6}. */

import java.util.*;
public class arraypr {
	public int[] append(int[] a1, int[] a2)
	{
		int[] newArr = new int[a1.length + a2.length];
		int i = 0;
		
		for(; i < a1.length; i++)
		{
			newArr[i] = a1[i];
		}
		
		for(int j = 0; i < newArr.length; i++, j++)
		{
			newArr[i] = a2[j];
		}
		System.out.println(Arrays.toString(newArr));
		return newArr;
	}
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of first array= ");
		int s1=sc.nextInt();
		System.out.println("Enter the Size of Second array array= ");
		int s2=sc.nextInt();
		//int s3=s1+s2;
		int[] arr1,arr2;
		arr1=new int[s1];
		System.out.println("Enter the Element of First Array");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
			
		}
		
		arr2=new int[s2];
		System.out.println("Enter the Element of Second Array");
		for(int j=0;j<arr2.length;j++) {
			arr2[j]=sc.nextInt();
			
		}
		arraypr a=new arraypr();
		a.append(arr1, arr2);
		a.append(arr2, arr1);
		//System.out.println(Arrays.toString(newArr));
		sc.close();
		
	}
}
