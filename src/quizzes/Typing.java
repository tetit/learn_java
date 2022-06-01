package quizzes;

public class Typing {

	public static void main(String[] args) {
		String b = "54.3";
//		double d = Double.valueOf(b);
		double d = Double.parseDouble(b);
		System.out.println(d);
		
		boolean a = true;
		boolean c = false;
		System.out.println(a^c);
		System.out.println(a^a);
		System.out.println(c^c^a^a);
		
		
	}

}
