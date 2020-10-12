
public class Arr5 {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 5, d=34, e=77;
		
		int max = a; // assume first number is my max
		int secondMax=b;
		if(max < b||secondMax<b){
			secondMax=max;
			max = b;
		}
		
		if(max < c||secondMax<c){
			secondMax=max;
			max = c;
		}
		
		if(max < d||secondMax<d){
			secondMax=max;
			max = d;
		}
		
		if(max <e||secondMax<e){
			secondMax=max;
			max = e;
		}
		
		System.out.println("Max is "+ max);
		System.out.println("Second Max is "+ secondMax);
		
	}

}