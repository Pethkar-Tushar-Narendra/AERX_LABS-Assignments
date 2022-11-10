package interview.aerx_labs;

//ASSIGNMENT 2:
//In an integer array of size 99, numbers are stored ranging from 1-100 with no
//repetition and array is not sorted. So the numbers range is 1-100 and size of the array
//is 99 which means the array will not have a number in given range. Find that missing
//number.
//
//Function int Find_Missing_Number(int arrayIn[])
//
//CONDITION: Do not sort the array
//
//e.g: arrayIn = {1,2,3,4,6,.......100}
//return value = 5


public class Assignment2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] array = new int[99];
		int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
//		0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,
		
		int result = find_missing_number(array);
		if(result==-1)System.out.println("All integers from 1 to 100 present");
		else System.out.println("Missing Integer is "+result);
	}

	private static int find_missing_number(int[] array) {
		// TODO Auto-generated method stub
		//for sorted
//		for(int i=0;i<array.length;i++) {
//			if(array[i]!=i+1)return i+1;
//		}		
//		return 100;
		
		
		//for unsorted Array
		int count=0;
		for(int i=1;i<=100;i++) {count=0;
			for(int j=0;j<array.length;j++) {
				if(i==array[j]) {count++;break;}
			}if(count==0)return i;
		}
		return -1;
	}

}
