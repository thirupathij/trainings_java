public class DemoDogCls{
	public static void main(String[] args){
		bark("barking");
		bark(10);
		bark("halwing");
		bark(5);
		bark("barking", 20);
		
	}
	public static void bark(String type){
		System.out.println("Dog is "+type);
	}
	public static void bark(int times){
		System.out.println("Dog is "+times+" times braking/halwing...");
	}
	public static void bark(String type, int times){
		System.out.println("Dog is "+times+" times "+type);
	}
	
}