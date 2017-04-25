public class ArrayMerge{
	public static void main(String[] args){
		int[] numArrOne = {10,20,30,40,50};
		int[] numArrTwo = {2,3,4,67, 88};
		int[] resultArr = new int[numArrOne.length + numArrTwo.length];
		int i, j;
		
		System.out.println("Array Length: "+resultArr.length);
		
		for(i=0; i<numArrOne.length; i++){
			resultArr[i] = numArrOne[i];
		}
		for(j=0; j<numArrTwo.length; j++){
			resultArr[i] = numArrTwo[j];
			i++;
		}		
				
		System.out.println("Displaying Array Data: ");
		for(i=0; i<resultArr.length; i++){
				System.out.println(i+" element is "+resultArr[i]);
		}
		
	}
}