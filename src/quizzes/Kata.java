package quizzes;

public class Kata {
	public static boolean solution(String str, String ending) {
		StringBuilder sb = new StringBuilder(str);
		StringBuilder sbEnd = new StringBuilder(ending);
		boolean rez = true;
		
		if(sb.length() >= sbEnd.length()) {
			int i = sbEnd.length()-1;
			int j = sb.length()-1;
			while(rez && i >= 0) {
				rez = sbEnd.charAt(i) == sb.charAt(j) ? true : false;
				i--;
				j--;
				
			}
		}
		else rez = false;
	    return rez;
	  }
	
	public static boolean solution1(String str, String ending) {
		return str.endsWith(ending);
	}
	}


