import java.util.Scanner;
public class SwapNumbers{
	public static void main(String []args){
		
		int a, b, temp;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number A :");
		a = s.nextInt();
		
		System.out.print("Enter Number B :");
		b = s.nextInt();

		temp = a;
		a = b;
		b = temp;
			

		System.out.println("After Swap Value Of A is "+ a +" & Value Of B is "+b);
		
		
	}
}