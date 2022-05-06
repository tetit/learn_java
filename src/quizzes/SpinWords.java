package quizzes;

import java.util.Arrays;

public class SpinWords {

	public static String spinWords(String sentance) {
		int count = 0;
		char[] arr = new char[sentance.length()];
		StringBuilder sb = new StringBuilder();
		StringBuilder sbInsert = new StringBuilder();
		
		for(int i = 0; i < sentance.length(); i++) {
			arr[i] = sentance.charAt(i);
		}
		
		
		for(int i = 0; i < arr.length; i++) {
			if(Character.isWhitespace(arr[i])) {
				if(count >= 5) {
					sb.reverse();
					sbInsert.insert(sbInsert.length(), sb);
					sbInsert.insert(sbInsert.length(), " ");
			}
			
				else {
					sbInsert.insert(sbInsert.length(), sb);
					sbInsert.insert(sbInsert.length(), " ");
			}
				sb.delete(0, i);
				count = 0;
			}
			else if(i==arr.length-1) {
					count++;
					sb.append(arr[i]);	
					
					if(count >= 5) {
						sb.reverse();
						sbInsert.insert(sbInsert.length(), sb);
				}
				
					else {
						sbInsert.insert(sbInsert.length(), sb);
				}
				}
				
			
			else {
				count++;
				sb.append(arr[i]);
				
		}
		}
		

		return sbInsert.toString();
	}

}