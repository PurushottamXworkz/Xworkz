package com.xworkz.shoppingcart.runner;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.shoppingcart.dto.ShoppingDetails;

public class ShoppingCartRunner {
	public static void main(String[] args) {
		
		List <ShoppingDetails> list= new ArrayList<ShoppingDetails>();
		list.add(new ShoppingDetails(10, "Mobile phones", "Electronic Devices"));
		
		list.add(new ShoppingDetails(5, "modems", "electronics"));
		
		list.set(0, new ShoppingDetails(100, "gaming laptop", "Electronic Devices"));
		
		System.out.println(list);
		
		list.get(1);
		
		System.out.println(list.contains(list));
		
		System.out.println(list.isEmpty());
		
		list.remove(1);
		System.out.println(list);
		  
	}
}
