public class ThisKeyWordDemo{
	
	int num, i=0;
	String name;
	
	ThisKeyWordDemo(int num, String name){
		System.out.println("Initializing name and number...");
		this.num = num;
		this.name = name;
		this.i = this.i + 1;
		System.out.println("Calling constructor "+this.i);
	}
	
	ThisKeyWordDemo(String name){
		this();
		System.out.println("Initializing only name...");
		this.name = name;
		this.i = this.i + 1;
		System.out.println("Calling constructor "+this.i);
	}
	ThisKeyWordDemo(int num){
		this();
		System.out.println("Initializing only number...");
		this.num = num;
		this.i = this.i + 1;
		System.out.println("Calling constructor "+this.i);
	}	
	ThisKeyWordDemo(){
		num = 111;
		name = "Default Name";
		System.out.println("Initializing default constructor....");		
		this.i = this.i + 1;
		System.out.println("Calling constructor "+this.i);
	}	
	
	public static void main(String[] args){
		
		ThisKeyWordDemo objThisOne = new ThisKeyWordDemo();
		ThisKeyWordDemo objThisTwo = new ThisKeyWordDemo(31, "Thirupathi Jarajapu");
		System.out.println("Name: "+objThisTwo.name+" Number: "+objThisTwo.num);
		
		ThisKeyWordDemo objThisThree = new ThisKeyWordDemo(28);
		System.out.println("Name: "+objThisThree.name+" Number: "+objThisThree.num);
		
		ThisKeyWordDemo objThisFour = new ThisKeyWordDemo("Meena Jarajapu");
		System.out.println("Name: "+objThisFour.name+" Number: "+objThisFour.num);		
		
	}
}