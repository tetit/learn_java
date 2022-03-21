package com.itbulls.learnit.javacore.oop.homework.onlineshop.services;

import com.itbulls.learnit.javacore.oop.homework.onlineshop.enteties.Order;

public interface OrderManagementService {

	void addOrder(Order order);

	Order[] getOrdersByUserId(int userId);
	
	Order[] getOrders();

}
