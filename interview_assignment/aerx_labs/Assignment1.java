package interview_assignment.aerx_labs;

import java.util.ArrayList;
import java.util.List;

	/*	Write a function to find the longest common prefix string amongst an array of strings.

		return an empty string("") in case there is no common prefix.

		Function: String Find_Common_Prefix(List<String> String_List)

		e.g: String_List = {"suyash" "sukesh" "sumit" "sunil" "suresh"};
		return: "su"

		e.g: String_List = {"mahesh" "saqlain" "labeeb" "shashank" "nazif"};
		return: ""
	*/
		

public class Assignment1 {
	public static void main(String[] args) throws EmptyListException {
		List<String> list = new ArrayList<String>();
		list.add("suhesh");
		list.add("suqlain");
		list.add("suyashs");
		list.add("suyash");
		list.add("suyash");
		list.add("suyash");
		Assignment1 assignment1 = new Assignment1();
		String result = assignment1.find_comman_prefiix(list);
		if(result=="")System.out.println("No common prefix string amongst an array of strings.");
		else System.out.println("common prefix string amongst an array of strings is '"+result+"'");
	}

	private String find_comman_prefiix(List<String> list) {
		//if Empty list is passed
		try {
			if(list.size()==0)
				throw new EmptyListException("You have passes empty list.");
			} catch (EmptyListException e1) {
				System.err.println(e1.getMessage());System.out.println();
				return"";
			}
		
		//if list has only one element
		if(list.size()==1) return list.get(0);
		
		//if list has many elements
		//As it is slower to iterate list than array so i converted list to array		
        String[] array = list.toArray(new String[list.size()]);
		int matchedIndex =0;
		int count=0;
		for(int i=0;i<array[0].length();i++) {count=0;
			for(int j=1;j<array.length;j++) {
				try{if(array[j].charAt(i)==array[0].charAt(i))count++;}
				catch(StringIndexOutOfBoundsException e){break;}		
			}if(count==array.length-1)matchedIndex++;
			else break;
		}
		if(matchedIndex>0)return array[0].substring(0,matchedIndex);
		else return "";
		
		/*
		 * why I haven't used iterator
		 * why array
		 * why for loop
		 * is this best complexity
		 */
		
	}

}
