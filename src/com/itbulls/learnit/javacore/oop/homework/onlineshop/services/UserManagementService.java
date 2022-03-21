package com.itbulls.learnit.javacore.oop.homework.onlineshop.services;

import com.itbulls.learnit.javacore.oop.homework.onlineshop.enteties.User;

public interface UserManagementService {

	String registerUser(User user);
	
	User[] getUsers();

	User getUserByEmail(String userEmail);

}