public class PrintArrayReverse{
	public static void main(String[] args){
		int[] numArr = {10,20,30,40,50};
				
		System.out.println("Displaying numArray Data Reverse Order: ");
		for(int i = numArr.length-1; i >= 0; i--){
			System.out.println(i+" element is "+numArr[i]);
		}	
		
	}
}