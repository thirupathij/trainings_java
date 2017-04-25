import java.util.Scanner;
public class FindGreatestNum{
	public static void main(String []args){
		int num1, num2, num3, bigNum = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter First Number :");
		num1 = s.nextInt();
		
		System.out.print("Enter Second Number :");
		num2 = s.nextInt();
		
		System.out.print("Enter Third Number :");
		num3 = s.nextInt();
		
		if(num1 > num2 && num1 > num3){
			bigNum = num1;			
		}else if(num2 > num1 && num2 > num3){
			bigNum = num2;
		}else if(num3 > num1 && num3 > num2){
			bigNum = num3;
		}
		
		System.out.println("Biggest Number is "+bigNum);
		
	}
}