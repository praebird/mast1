import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number till which you want fibonacci series upto= ");
		int x =sc.nextInt();
		int i;
		int j=0,t=1;
		for (i = 1; i <= x; ++i)
        {
            System.out.print(j+" ");

            int sumOfPrevTwo = j + t;
            j = t;
            t = sumOfPrevTwo;
        }
		sc.close();
	}

}
