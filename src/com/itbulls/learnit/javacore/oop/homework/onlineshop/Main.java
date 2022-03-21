package com.itbulls.learnit.javacore.oop.homework.onlineshop;

import com.itbulls.learnit.javacore.oop.homework.onlineshop.menu.Menu;
import com.itbulls.learnit.javacore.oop.homework.onlineshop.menu.impl.MainMenu;

public class Main {
	
	public static final String EXIT_COMMAND = "exit";

	public static void main(String[] args) {
		Menu mainMenu = new MainMenu();
		mainMenu.start();
	}

}
