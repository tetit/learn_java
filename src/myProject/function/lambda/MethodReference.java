package myProject.function.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class MethodReference {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.forEach(number -> System.out.println(number));
		
		numbers.forEach(System.out::println);
		
		Function<String, Integer> toInteger = string -> parse(string);
		Integer integer = toInteger.apply("5");
		
		Function<String, Integer> toInteger2 = MethodReference::parse;
		System.out.println(toInteger2.apply("10"));
		
		UserFactory userFacctory = User::new;
		User user = userFacctory.create("Jon", "Snow");
		
		
		Function<String, String> trim = String::trim;
		String str = trim
				.andThen(String::toLowerCase)
				.andThen(StringBuilder::new)
				.andThen(StringBuilder::reverse)
				.andThen(StringBuilder::toString)
				.apply("ABCDEFG");
		
		System.out.println(str);
		
		List<User> users = new ArrayList<>();
        users.add(new User("Nick", "Boll"));
        users.add(new User("Jan", "Nicky"));
        users.add(new User("Bot", "Smart"));
        
        users.sort(Comparator.comparing(User::getName));
        users.forEach(System.out::println);

	}
	
	private static Integer parse(String s) {
		return Integer.parseInt(s);
	}

}
