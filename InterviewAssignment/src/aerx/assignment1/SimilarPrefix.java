package aerx.assignment1;

import java.util.ArrayList;
import java.util.List;


public class SimilarPrefix {

	public static void main(String[] args) throws EmptyListException {
		List<String> list = new ArrayList<String>();
		list.add("suyash");
		list.add("sukesh");
		list.add("sumit");
		list.add("sunil");
		list.add("suresh");
		list.add("suyash");
		SimilarPrefix similarPrefix = new SimilarPrefix();
		String result = similarPrefix.find_comman_prefiix(list);
		if(result=="")System.out.println("No common prefix string amongst an array of strings.");
		else System.out.println("common prefix string amongst an array of strings is \""+result+"\".");
	}

	private String find_comman_prefiix(List<String> list) {
		//if Empty list is passed
		byte noOfStrings = (byte)list.size();
		try {
			if(noOfStrings==0)
				throw new EmptyListException("You have passes empty list.");
			} catch (EmptyListException e1) {
				System.err.println(e1.getMessage());System.out.println();
				return"";
			}
		
		//if list has only one element
		if(noOfStrings==1) return list.get(0);
		
		//if list has many elements
		//As it is slower to iterate list than array so i converted list to array		
        String[] array = list.toArray(new String[noOfStrings]);	
        
		String firstString = array[0];
		byte matchedIndex =0;
		boolean count;
		short firstStringLength= (short) firstString.length();	
		
		for(byte i=0;i<firstStringLength;i++) {count=true;
			for(byte j=1;j<noOfStrings;j++) {
				try{if(array[j].charAt(i)!=firstString.charAt(i)) {count=false;}}
				catch(StringIndexOutOfBoundsException e){count = false;break;}//if one string is shorter than other then it is break condition
			}if(count)matchedIndex++;
			else break;
		}
		if(matchedIndex>0)return firstString.substring(0,matchedIndex);
		else return "";		
	}

}
