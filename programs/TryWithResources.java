import java.io.*;
public class TryWithResources{
	public static void main(String[] args){
		
		FileReader fr = null;
		
		try{
			File file = new File("demo.txt");
			fr = new FileReader(file);
			char[] charsFromFile = new char[1000];
			fr.read(charsFromFile);
			for(char ch:charsFromFile){
				System.out.print(ch);
			}			
		}catch(IOException e){			
			e.printStackTrace();
		}finally{
			try{
				fr.close();
			}catch(IOException ex){
				ex.printStackTrace();
			}		
			
		}		
		
	}
}