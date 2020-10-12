import java.util.Scanner;

class Area{

	double length;
	double breadth;
	double area;

	
	void area() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter length in cm=");
		length= scan.nextInt();
		System.out.println("Enter Breadth in cm =");
		breadth= scan.nextInt();
		area =  length*breadth;
		System.out.println("Area of The  Rectangle in sqcm= "+	area);
		scan.close();
	}
}


