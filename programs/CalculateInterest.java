import java.util.Scanner;
public class CalculateInterest{
	public static void main(String []args){
		
		float simpleInterest, principal, reateOfInterest, timeDuration;
		double compoundInterest;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Principal Amount :");
		principal = s.nextFloat();
		
		System.out.print("Enter Reate Of Interest :");
		reateOfInterest = s.nextFloat();
		
		System.out.print("Enter Time Duration :");
		timeDuration = s.nextFloat();
		
		simpleInterest = (reateOfInterest * timeDuration * principal) / 100;		
		
		System.out.println("Simple Interest :"+simpleInterest);	

		compoundInterest = principal * Math.pow((1 + reateOfInterest/100),timeDuration);

		System.out.println("Compound Interest :"+compoundInterest);		
		
	}
}