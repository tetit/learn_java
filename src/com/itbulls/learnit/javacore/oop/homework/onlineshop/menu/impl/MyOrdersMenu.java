package com.itbulls.learnit.javacore.oop.homework.onlineshop.menu.impl;

import com.itbulls.learnit.javacore.oop.homework.onlineshop.configs.ApplicationContext;
import com.itbulls.learnit.javacore.oop.homework.onlineshop.enteties.Order;
import com.itbulls.learnit.javacore.oop.homework.onlineshop.menu.Menu;
import com.itbulls.learnit.javacore.oop.homework.onlineshop.services.OrderManagementService;
import com.itbulls.learnit.javacore.oop.homework.onlineshop.services.impl.DefaultOrderManagementService;

public class MyOrdersMenu implements Menu {

	private ApplicationContext context;
	private OrderManagementService orderManagementService;

	{
		context = ApplicationContext.getInstance();
		orderManagementService = DefaultOrderManagementService.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		if (context.getLoggedInUser() == null) {
			System.out.println(
					"Please, log in or create new account to see list of your orders");
			new MainMenu().start();
			return;
		} else {
			printUserOrdersToConsole();
		}
		new MainMenu().start();
	}
	
	private void printUserOrdersToConsole() {
		Order[] loggedInUserOrders = orderManagementService
				.getOrdersByUserId(context.getLoggedInUser().getId());

		if (loggedInUserOrders == null || loggedInUserOrders.length == 0) {
			System.out.println(
					"Unfortunately, you don�t have any orders yet. "
					+ "Navigate back to main menu to place a new order");
		} else {
			for (Order order : loggedInUserOrders) {
				System.out.println(order);
			}
		}
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** MY ORDERS *****");			
	}

}
