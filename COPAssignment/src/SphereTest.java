import java.util.Scanner;

public class SphereTest {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the radius of Sphere==");
	double z = sc.nextDouble();
	
	Sphere Sp =new Sphere(z);
	
	double Area = Sp.SurfaceArea(z);
	System.out.println("Surface Area of Sphere:"+ Area);
	

	double Vol = Sp.Volume(z);
	System.out.println("Volume of Sphere:"+ Vol);
	
	sc.close();

	
}
}
