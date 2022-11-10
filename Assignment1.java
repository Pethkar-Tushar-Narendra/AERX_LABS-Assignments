package interview.aerx_labs;

import java.util.ArrayList;
import java.util.List;

//		Write a function to find the longest common prefix string amongst an array of strings.
//
//		return an empty string("") in case there is no common prefix.
//
//		Function: String Find_Common_Prefix(List<String> String_List)
//
//		e.g: String_List = {"suyash" "sukesh" "sumit" "sunil" "suresh"};
//		return: "su"
//
//		e.g: String_List = {"mahesh" "saqlain" "labeeb" "shashank" "nazif"};
//		return: ""
		

public class Assignment1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("mahesh");
		list.add("saqlain");
		list.add("suyashs");
		list.add("suyash");
		list.add("suyash");
		list.add("suyash");
//		System.out.println(list);
		String result = find_comman_prefiix(list);
		if(result=="")System.out.println("No common prefix string amongst an array of strings.");
		else System.out.println("common prefix string amongst an array of strings is '"+result+"'");
	}

	private static String find_comman_prefiix(List<String> list) {
		// TODO Auto-generated method stub
		if(list.size()==0) return "Empty String add exception.";
		if(list.size()==1) return list.get(0).substring(0,list.get(0).length());
		
		int matchedIndex =0;
		int count=0;
		for(int i=0;i<list.get(0).length();i++) {count=0;
			for(int j=1;j<list.size();j++) {
				try{if(list.get(j).charAt(i)==list.get(0).charAt(i))count++;}catch(StringIndexOutOfBoundsException e){break;}			
			}if(count==list.size()-1)matchedIndex++;
			else break;
		}
		if(matchedIndex>0)return list.get(0).substring(0,matchedIndex);
		else return "";
	}

}
