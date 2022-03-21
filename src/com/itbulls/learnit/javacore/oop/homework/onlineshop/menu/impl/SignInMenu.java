package com.itbulls.learnit.javacore.oop.homework.onlineshop.menu.impl;

import java.util.Scanner;

import com.itbulls.learnit.javacore.oop.homework.onlineshop.configs.ApplicationContext;
import com.itbulls.learnit.javacore.oop.homework.onlineshop.enteties.User;
import com.itbulls.learnit.javacore.oop.homework.onlineshop.menu.Menu;
import com.itbulls.learnit.javacore.oop.homework.onlineshop.services.UserManagementService;
import com.itbulls.learnit.javacore.oop.homework.onlineshop.services.impl.DefaultUserManagementService;

public class SignInMenu implements Menu {

	private ApplicationContext context;
	private UserManagementService userManagementService;

	{
		context = ApplicationContext.getInstance();
		userManagementService = DefaultUserManagementService.getInstance();
	}

	@Override
	public void start() {
		
			printMenuHeader();
			Scanner sc = new Scanner(System.in);

			System.out.print("Please, enter your email: ");
			String userEmail = sc.next();

			System.out.print("Please, enter your password: ");
			String userPassword = sc.next();

			User user = userManagementService.getUserByEmail(userEmail);
			if (user != null && user.getPassword().equals(userPassword)) {
				System.out.printf("Glad to see you back %s %s", user.getFirstName(),
						user.getLastName() + System.lineSeparator());
				context.setLoggedInUser(user);
			} else {
				System.out.println("Unfortunately, such login and password doesn�t exist");
			}
			context.getMainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** Sign In *****");	
	}

}
