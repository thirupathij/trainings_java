class BaseCls{
	int a,b;
	BaseCls(int x, int y){
		System.out.println("Calling Base Class Constructor !");
		this.a = x;
		this.b = y;
	}
	public void addNums(){
		System.out.println("Addition of A & B: "+(this.a + this.b));
	}
	public void display(){
		System.out.println("Welcome Message From Super Class !");		
	}
}

public class SuperKeywordDemo extends BaseCls{
	SuperKeywordDemo(int x, int y) {
		super(x, y);
		super.display();
	}
	public void multiplyNums(){
		System.out.println("Multiplication of A & B: "+(super.a * super.b));
	}

	public static void main(String[] args){
		SuperKeywordDemo ins = new SuperKeywordDemo(20, 30);
		ins.addNums();
		ins.multiplyNums();
	}
}