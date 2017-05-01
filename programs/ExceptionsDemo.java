import java.io.*;
public class ExceptionsDemo{
		//Try cach with few existed exceptions
	public static void main(String[] args){
		int[] numArr = {10,20,30,40};
		int n = 10;
		try{
			System.out.println("Number to display: "+numArr[5]);
			File txtFile = new File("exceptions.txt");
			FileReader fr = new FileReader(txtFile);
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException: "+e);			
		}catch(FileNotFoundException f){
			System.out.println("FileNotFoundException : "+f);			
		}finally{
			System.out.println("Done with execution !");			
		}
	
	}
}