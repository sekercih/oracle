package workshop05;

import java.util.*;
 class Product {
	int id;
	String name;

	Product(int id, String name) {
		this.id = id;
		this.name = name;

	}
}

public class Examples02{

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
	
		list.add(new Product(10,"Icecream"));
		list.add(new Product(11,"Chocolate"));
		Product p1=new Product(10, "Icecream");
		System.out.println(list.toString());
		System.out.println(list.indexOf(p1));
		
		

	}
}
