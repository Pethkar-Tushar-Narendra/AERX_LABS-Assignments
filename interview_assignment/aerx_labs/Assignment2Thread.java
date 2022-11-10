package interview_assignment.aerx_labs;

public class Assignment2Thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int[] array = {19,20,21,22,23,24,28,26,27,29,30,31,32,33,25,35,36,37,1,40,41,42,43,44,45,2,3,4,5,6,7,8,57,34,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,58,9,10,11,12,13,14,15,16,17,18,38,39,46,47,48,49,50,51,52,53,54,55,56,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
		
		find_missing_number(array);
	}
	private static void find_missing_number(int[] array) throws InterruptedException {	
		//for unsorted Array
		//array size less than 99 or more Array not upto mark exception
		Thread t1 = new Thread(()->{
			int count=0;
			for(int i=1;i<=25;i++) {count=0;
				for(int j=0;j<array.length;j++) {
					if(i==array[j]) {count++;break;}
				}if(count==0) {System.out.println("Missing Integer is "+i);return;}
			}
		});
		Thread t2 = new Thread(()->{
			int count=0;
			for(int i=26;i<=50;i++) {count=0;
			for(int j=0;j<array.length;j++) {
				if(i==array[j]) {count++;break;}
			}if(count==0) {System.out.println("Missing Integer is "+i);return;}
		}
		});
		Thread t3 = new Thread(()->{
			int count=0;
			for(int i=51;i<=75;i++) {count=0;
				for(int j=0;j<array.length;j++) {
					if(i==array[j]) {count++;break;}
				}if(count==0) {System.out.println("Missing Integer is "+i);return;}
			}
		});
		Thread t4 = new Thread(()->{
			int count=0;
			for(int i=76;i<=100;i++) {count=0;
				for(int j=0;j<array.length;j++) {
					if(i==array[j]) {count++;break;}
				}if(count==0) {System.out.println("Missing Integer is "+i);return;}
			}
		});
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t1.join();
		t2.join();
		t3.join();
		t4.join();
	}
}
