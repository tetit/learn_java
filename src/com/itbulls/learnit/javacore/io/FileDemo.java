package com.itbulls.learnit.javacore.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("testDirectory");
		file.mkdir();
		
		file = new File("testDirectory2\\innerTestDirectory");
		file.mkdirs();
		
		file = new File("testDirectory3" + File.separator + "innerTestDirectory");
		if (file.mkdirs()) {
			System.out.println("Success");
		}
		else {
			System.out.println("Files are exist");
		}
		
		System.out.println("File separator: " + File.separator);
		System.out.println("Path separator: " + File.pathSeparator);
		
		String toWrite = "asdasdasd" + System.lineSeparator() + "new line"; // \r\n or \n
		System.out.println(toWrite);
		
		file = new File("result.csv");
		file.createNewFile();
		
		file.exists();
		System.out.println(file.exists());
		if (file.isDirectory()) {
			File[] files = file.listFiles();
		}
		
		file.getAbsolutePath();
		System.out.println(file.getAbsolutePath());
		System.out.println(file.canExecute());
		System.out.println(file.isFile());
		System.out.println(file.isHidden());
		
		File[] listFiles = file.listFiles(pathname -> pathname.getName().endsWith(".java"));
		
		new File("C:\\Program Files\\Java");
		

	}

}
