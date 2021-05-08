package WAC1;
import java.util.Scanner;
public class Swap 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value");
		int v1 = sc.nextInt();
		System.out.println("Enter the second value");
		int v2 = sc.nextInt();
		System.out.println("Values before swapping: v1 = " + v1 + " v2 = " + v2);
		v1 = v1 + v2;
		v2 = v1 - v2;
		v1 = v1 - v2;
		System.out.println("Values after swapping: v1 = " + v1 + " v2 = " + v2);
	}
}
