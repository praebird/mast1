import java.util.Scanner;
public class winter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//winter wt = new winter();
		int mth;
		int date;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month(1 to 12)==");
		
		mth=sc.nextInt();

		System.out.println("Enter date(1 to 31)==");
		date=sc.nextInt();
		winter.season(mth,date);
		
		sc.close();
		
	}
		public static void season(int m , int d) {

			if((m==12 && d>=16)  || (m==1 || m==2  && d>=1) || (m==3 && d<=15) ) {
				System.out.println("Winter");
				
				
			}
			
			else if((m==3 && d>=16)  || (m==4 || m==5 && d>=1) || (m==6 && d<=15) ) {
				System.out.println("Spring");
			}
			
			else if((m==6 && d>=16)  || (m==7 || m==8 && d>=1) || (m==9 && d<=15) ){
				System.out.println("Summer");
			}
			
			else if((m==9 && d>=16)  || (m==10 || m==11 && d>=12) || (m==12 && d<=15) ){
				System.out.println("Fall");
			}
			
			else if(m>13 || d>32) {
				System.out.println("Invalid date");
			}
			
			else {
				
				System.out.println("Invalid date");
			}
			
		}
		
		

	}


