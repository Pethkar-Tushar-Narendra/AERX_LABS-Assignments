/*
ASSIGNMENT 2:
In an integer array of size 99, numbers are stored ranging from 1-100 with no
repetition and array is not sorted. So the numbers range is 1-100 and size of the array
is 99 which means the array will not have a number in given range. Find that missing
number.

Function int Find_Missing_Number(int arrayIn[])

CONDITION: Do not sort the array

e.g: arrayIn = {1,2,3,4,6,.......100}
return value = 5

*/

package interview_assignment.aerx_labs;
public class Assignment2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,19,20,21,22,23,24,25,26,27,29,30,31,32,33,34,35,36,37,1,40,41,42,43,44,45,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,38,39,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
		
		Assignment2 assignment2 = new Assignment2();
		int result = assignment2.find_missing_number(array);
		if(result==-1)System.out.println("Check message and try again..");
		else if(result==-2)System.out.println("Array is not unique.");
		else System.out.println("Missing Number is "+result);
	}

	private int find_missing_number(int[] array) {
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
		boolean isPresent=false;
		for(int i=1;i<=100;i++) {isPresent=false;
			for(int j=0;j<array.length;j++) {
				if(i==array[j]) {isPresent=true;break;}
			}if(!isPresent)return i;
		}
		return -2;
	}

}
