package com.itbulls.learnit.javacore.methods.hw;
import java.util.Arrays;

public class StringProcessor {
	 public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator() +
				"peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator() +
				"james;Derek James;james@gmail.com" + System.lineSeparator() +
				"jackson;Walter Jackson;jackson@gmail.com" + System.lineSeparator() +
				"gregory;Mike Gregory;gregory@yahoo.com";
		
		public static void main(String[] args) {
			System.out.println("===== Convert 1 demo =====");
			System.out.println(convert1(INPUT_DATA));
			
			System.out.println("===== Convert 2 demo =====");
			System.out.println(convert2(INPUT_DATA));
			
		}
		
		public static String convert1(String input) {
			String convert1 = "";
			String[] arr = input.split(System.lineSeparator());
			for (int i = 1; i < arr.length; i++) {
				String[] word = arr[i].split(";");
				convert1 += word[0] + " ==> " + word[2] + System.lineSeparator();
			}
			return convert1;
		}
		
		
		
		  public static String convert2(String input) {
			  String convert2 = new String();
			  String[] arr = input.split(System.lineSeparator());
			  for (int i = 1; i < arr.length; i++) {
				  String[] word = arr[i].split(";");
				  convert2 += word[1] + " (email: " + word[2] + ")" + System.lineSeparator();
			  }
			  return convert2;
		  }
		 
	}
