import java.util.Scanner;
public class factorial {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number==");
		int t=sc.nextInt();
		int z1=factorial.fact(t);
		System.out.println("Factorial =  "+z1);
		System.out.println("By Recursive Function -------");
		System.out.println("Enter the Number==");
		int t2=sc.nextInt();
		int Z2=factorial.fact(t2);
		System.out.println("Factorial =  "+Z2);
		sc.close();	
	}
		public static int fact(int num) {
			int f=1;			
			for (int i =num; i>=1; i--){
				f=f*i;
			}
			return f;
		}	
		public static int FACT(int n1) {			
			if (n1==0 || n1 == 1) {
				return 1;
			}			
			else {
			return n1 * FACT(n1-1);
		}
		}
	}


