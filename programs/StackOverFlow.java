import java.io.*;
public class StackOverFlow{
	
	//It will run out of memory since incrementNum is calling recursively
		
	public static void main(String[] args){
		
		int n = 10;
		incrementNum(n);		
		
	}
	
	public static void incrementNum(int num){
		System.out.println("Number: "+num);
		incrementNum(num+1);		
	}

}