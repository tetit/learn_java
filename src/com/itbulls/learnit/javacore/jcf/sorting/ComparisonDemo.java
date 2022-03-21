package com.itbulls.learnit.javacore.jcf.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.itbulls.learnit.javacore.jcf.hw.onlinestore.withlist.enteties.Product;
import com.itbulls.learnit.javacore.jcf.hw.onlinestore.withlist.enteties.impl.ComparableProduct;
import com.itbulls.learnit.javacore.jcf.hw.onlinestore.withlist.services.impl.DefaultProductManagementService;



public class ComparisonDemo {

	public static void main(String[] args) {
		
		// === Demo - Sorting Integers (type that implements Comparable)
		System.out.println("===== Integers =====");
		
		List<Integer> integers = new ArrayList<>(Arrays.asList(1, 15, 2, 37, 100));
		System.out.println("Original list: " + integers);
		
		integers.sort(Comparator.reverseOrder());
		System.out.println("Reversed order: " + integers);
		
		integers.sort(Comparator.naturalOrder());
		System.out.println("Natural order: " + integers);
		
		// === Demo - Sorting Products (type that doesn't implement Comparable)
		
		System.out.println("===== Products =====");
		
		List<Product> products = DefaultProductManagementService.getInstance().getProducts();
		printProductsInNewLine(products);
		
		

	}
	
	class ProductNameComparator implements Comparator<Product> {

		@Override
		public int compare(Product product1, Product product2) {
			return product1.getProductName().compareTo(product2.getProductName());
		}

}
}
