/*import java.util.Arrays;

public class sortstr {
	public static void main(String[] args) {
		
		//char c [] = new char[10];
		
		char c [] = {'z','q','k','a' , 'b' , 'g', 'd'} ;
		
		Arrays.sort(c);
		
		System.out.println(c);
		
		
	}
}

*/

/* Java Program Example - Sort Strings */
		
import java.util.Scanner;

public class sortstr
{
    public static void main(String[] input)
    {
        int i, j;
        String temp;
        Scanner scan = new Scanner(System.in);
        
        String names[] = new String[5];
		
        System.out.print("Enter 5 strings : ");
        for(i=0; i<5; i++)
        {
            names[i] = scan.nextLine();
        }
		
        for(i=0; i<5; i++)
        {
            for(j=1; j<5; j++)
            {
                if(names[j-1].compareTo(names[j])>0)
                {
                    temp=names[j-1];
                    names[j-1]=names[j];
                    names[j]=temp;
                }
            }
        }

        System.out.println("Sorted List is :\n");
        for(i=0;i<5;i++)
        {
            System.out.println(names[i]);
        }
    scan.close();
    
    }
}
