package myProject.function.lambda;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("==========MyInteface==========");
		
		MyInterface ref;
		
		ref = () -> 3.1415;
		System.out.println("Value of Pi= " + ref.getPiValue());
		System.out.println("Value of Pi= " + ref.hashCode());
		
		
		System.out.println("==========MyIntefaceWithParam==========");
		
		MyInterfaceWithParam refP = (str) -> {
			String result = "";
			for (int i = str.length()-1; i >=0; i--)
				result += str.charAt(i);
			return result;
		};
		System.out.println("Lambda reversed = " + refP.reverse("Lambda"));
		
		
		System.out.println("==========GenericInteface==========");
		
		GenericInterface<String> reverse = (str) -> {
			
			String result = "";
			for (int i = str.length()-1; i >=0; i--)
				result += str.charAt(i);
			return result;
		};
		
		System.out.println("Lambda reversed = " + reverse.func("Lambda"));
		
		
		GenericInterface<Integer> factorial = (n) -> {
			
			int result = 1;
			for (int i = 1; i <= n; i++)
				result = i*result;
			return result;
		};
		
		System.out.println("factorial of 5 = " + factorial.func(5));

	}

}
