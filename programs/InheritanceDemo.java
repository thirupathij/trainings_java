class Operations{
	int a, b;
	public double addNums(int x, int y){
		this.a = x;
		this.b = y;
		return this.a + this.b;		
	}
	public double multiplyNums(int x, int y){
		this.a = x;
		this.b = y;
		return this.a * this.b;
	}
	
}
public class InheritanceDemo extends Operations{
	public double subtractNums(int x, int y){
		this.a = x;
		this.b = y;
		return this.a - this.b;
	}
	public static void main(String[] args){
		InheritanceDemo obj = new InheritanceDemo();
		
		System.out.println("Displaying Addition:"+obj.addNums(10, 20));
		
		System.out.println("Displaying Multiplication:"+obj.multiplyNums(20, 30));
		
		System.out.println("Displaying Subtraction:"+obj.subtractNums(50, 20));		
	}
}