import java.util.Scanner;
public class CheckVowelOrNot{
	public static void main(String []args){
		String str;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Character Here :");
		str = s.next();
		str = str.toLowerCase();
				
		switch (str){
			case "a":
				System.out.println("vowel");
				break;
			case "e":
				System.out.println("vowel");
				break;
			case "i":
				System.out.println("vowel");
				break;
			case "o":
				System.out.println("vowel");
				break;
			case "u":
				System.out.println("vowel");
				break;
			default :
				System.out.println("not vowel");
				break;				
		}
	}
}