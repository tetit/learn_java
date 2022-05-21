package myProject.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Print {
	
	void print(String s) {
		if (s == null) {
			throw new NullPointerException("Exception: s is null!");
		}
		System.out.println("Inside method print: " + s);
	}
	
	public String input() throws MyException {
	    String s = null;
	    try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
	        s = reader.readLine();
	   } catch (IOException e) {
	       System.out.println(e.getMessage());
	   }
	    if (s.equals("")){
	        throw new MyException ("String can not be empty!");
	    }
	    return s;
	}
	
	public String input2() {
	    String s = null;
	    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
	        s = reader.readLine();
	        if (s.equals("")) {
	            throw new MyException("String can not be empty!");
	        }
	    } catch (IOException | MyException e) {
	        System.out.println(e.getMessage());
	    }
	    return s;
	}

	public static void main(String[] args) {
		Print print = new Print();
		List<String> list = Arrays.asList("first step", null, "second step");
		
		for (String s:list) {
			try {
				print.print(s);
			}
			catch (NullPointerException e) {
				System.out.println(e.getMessage());
				System.out.println("Exception was processed. Program continues");
			}
			finally {
				System.out.println("Inside block finally");
			}
			System.out.println("Go program...");
			System.out.println("---------------------------------");
		}

	}

}
