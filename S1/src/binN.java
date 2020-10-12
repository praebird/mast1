import java.util.Scanner;
public class binN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A Binary Num 1=");
		int a =sc.nextInt(2);

		System.out.println("Enter A Binary Num 2=");
		int ae =sc.nextInt(2);
		int sumo=a+ae;
		
		if(a==ae) {
			System.out.println("a==ae");
		}
		
		else {System.out.println("cannot");}
		
		System.out.println("Sum of first binary numbers is == "  + Integer.toBinaryString(sumo)+" In Decimal"+sumo);

		//System.out.println(x: if x>10 );
		
		int b =0b01;
		int c =0b101;
		int d =0b0111;		
		int sum=b+d;
		System.out.println(b);
		System.out.println(Integer.toBinaryString(c));
		System.out.println(d);
		System.out.println("Sum is ==" + Integer.toBinaryString(sum)+" In Decimal"+sumo);
		sc.close();

	}

}
