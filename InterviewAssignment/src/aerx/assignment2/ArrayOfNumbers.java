package aerx.assignment2;

public class ArrayOfNumbers {
	public static void main(String[] args) {

		byte[] array = {19,20,21,22,23,24,28,26,27,29,30,31,32,33,25,35,36,37,1,40,41,42,43,44,45,2,3,4,5,6,7,8,57
				,34,59,60,61,62,63,64,65,66,67,80,69,70,71,72,73,74,75,76,77,78,79,58,9,10,11,12,13,14,15,16,17,18,
				38,39,46,47,48,49,50,51,52,53,54,55,56,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
		
		ArrayOfNumbers assignment2 = new ArrayOfNumbers();
		short result = assignment2.find_missing_number(array);
		if(result==-1)System.out.println("Check message and try again..");
		else if(result==-2)System.out.println("Array is not unique. OR Number above 100 is present.");
		else System.out.println("Missing Number is "+result);
	}

	private short find_missing_number(byte[] array) {
		//if array is more or less in number give invalid array
		try {
			if(array.length!=99)
				throw new InvalidArrayException("Invalid Array Size of array is not 99 but it is more or less.");
			} catch (InvalidArrayException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
				System.out.println();
				return -1;
			}
		
		//if array is valid array
		//for unsorted Array
		short sum = (short)((array.length+1)*(array.length+2)/2);
		for(byte number:array) {
			sum-=number;
		}return sum;
	}
}
