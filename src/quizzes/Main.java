package quizzes;

public class Main {

	public static void main(String[] args) {
		

//		int bit = BitCounting.countBits(12);
//		System.out.println(bit);
		
		String str = SpinWords.spinWords("art golkin dsjiohOHUVHOU; ,JJI Pkk");
		System.out.println(str);
		
		String str3 = new SpinWords().spinWords1("art golkin dsjiohOHUVHOU; ,JJI Pkk");
		System.out.println(str3);
		
		String str4 = new SpinWords().spinWords2("art golkin dsjiohOHUVHOU; ,JJI Pkk");
		System.out.println(str4);
		
		String str1 = new String("This is a test String");
	       String str2 = new String("Test ABC");
	       boolean var1 = str1.endsWith("String");
	       boolean var2 = str1.endsWith("ABC");
	       boolean var3 = str2.endsWith("String");
	       boolean var4 = str2.endsWith("ABC");
	       System.out.println("str1 ends with String: "+ var1);
	       System.out.println("str1 ends with ABC: "+ var2);
	       System.out.println("str2 ends with String: "+ var3);
	       System.out.println("str2 ends with ABC: "+ var4);
    }
}

