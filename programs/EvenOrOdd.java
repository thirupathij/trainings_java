import java.util.Scanner;
public class EvenOrOdd{
	public static void main(String []args){
		int i;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number :");
		i = s.nextInt();
		if(i%2 ==  0){
			System.out.println(i+" Is Even Number");			
		}else{
			System.out.println(i+" Is Not Even Number");			
		}	
		
	}
}