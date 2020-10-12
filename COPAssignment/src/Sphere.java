
public class Sphere {

	
	private double radius;

	public Sphere(double Radius) {
		
		Radius=this.radius;
	}

double  SurfaceArea(double R) {
	
		return (4*Math.PI*R*R);	
}

double  Volume(double R) {
	
	return ((4/3)*Math.PI*R*R*R);	
}


}