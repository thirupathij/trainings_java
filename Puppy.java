public class Puppy{
	
	String puppyName;
	int puppyAge;
	
	public Puppy(String name, int age){
		puppyName = name;
		puppyAge = age;
		System.out.println("Name Set to : "+name+ "\n" +"Age set to: "+age+"\n");		
	}
	
	public void getAllDetails(){
		System.out.println("Name: "+puppyName+ "\n" +"Age: "+puppyAge+"\n");		
	}
	
	public static void main(String []args){
		System.out.println("Starting program....");
		Puppy p = new Puppy("Tinky", 10);
		p.getAllDetails();
		
	}
	
}