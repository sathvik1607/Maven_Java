package Test.TEST_1;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try (Scanner sc = new Scanner(System.in)) {
			System.out.println( "Hello World!" );
			System.out.println("Enter the size of the array:");
			int n=sc.nextInt();
			System.out.println("Enter the numbers below:");
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]);
			}
		}
 
    }
}
