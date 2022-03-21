package com.itbulls.learnit.javacore.oop.homework.onlineshop.services;

import com.itbulls.learnit.javacore.oop.homework.onlineshop.enteties.Product;

public interface ProductManagementService {

	Product[] getProducts();

	Product getProductById(int productIdToAddToCart);

}
