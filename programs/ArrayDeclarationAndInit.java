public class ArrayDeclarationAndInit{
	public static void main(String[] args){
		int[] numArr = {10,20,30,40,50};
		double[] doubleArr = {1.2, 2.3, 4.5, 5.4, 3.3};
		
		System.out.println("Displaying numArray Data: ");
		for(int i=0; i<numArr.length; i++){
				System.out.println(i+" element is "+numArr[i]);
		}
		
		System.out.println("Displaying doubleArr Data: ");
		for(int i=0; i<doubleArr.length; i++){
				System.out.println(i+" element is "+doubleArr[i]);
		}
		
	}
}