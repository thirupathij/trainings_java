import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegExDemo{
	public static void main(String []args){
		String line = "String to123 be matched......";
		String pattern = "(.*)(\\d+)";
		
		Pattern ptrn = Pattern.compile(pattern);
		Matcher mchr = ptrn.matcher(line);
		if(mchr.find()){
			System.out.println("Found value: " + mchr.group(0) );
			System.out.println("Found value: " + mchr.group(1) );			
		}else{
			System.out.println("No Matches Found");
		}
	}
}