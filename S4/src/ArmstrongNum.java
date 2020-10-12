import java.util.Scanner;

public class ArmstrongNum{  
  public static void main(String[] args)  {  
    int c=0,a,temp;  
    System.out.println("Enter the Number==");
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();  
    temp=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("Yes it is a armstrong number");   
    else  
        System.out.println("Not armstrong number");  
    sc.close();
   }  
}  