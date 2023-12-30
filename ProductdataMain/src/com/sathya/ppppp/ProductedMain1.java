package com.sathya.ppppp;

import java.util.List;

public class ProductedMain1 {
	public static void main(String[] args) {
		ProductDao dao = new ProductDao(); 
		// Table Creation 
		int createResult = dao.createProducttable();
		System.out.println("Table creation status..." + createResult);
	}
}
class ProductedMain2 {
	public static void main(String[] args) { // Data insertion
		ProductDao dao = new ProductDao();
		Product product1 = new Product();
		product1.setProId("PD2450");
		product1.setProName("Sugar");
		product1.setProPrice(234.5);
		
		int result = dao.saveProduct(product1);
		if (result == 1) {
			System.out.println("Data inserted sucessfully....." + result);
		} else {
			System.out.println("Data insertion fail check once..." + result);
		}
	}
}
class ProductedMain3 {
	public static void main(String[] args) { // Data insertion
		ProductDao dao = new ProductDao();
		Product product2 = new Product();
		product2.setProId("P550");
		product2.setProName("Salt");
		product2.setProPrice(200.0);
		
		int result = dao.saveProduct(product2);
		if (result == 1) {
			System.out.println("Data inserted sucessfully....." + result);
		} else {
			System.out.println("Data insertion fail check once..." + result);
		}
	}
}
class ProductedMain4 {
	public static void main(String[] args) { // Data insertion
		ProductDao dao = new ProductDao();
		Product product3 = new Product();
		product3.setProId("P990");
		product3.setProName("paneer");
		product3.setProPrice(500.0);
		
		int result = dao.saveProduct(product3);
		if (result == 1) {
			System.out.println("Data inserted sucessfully....." + result);
		} else {
			System.out.println("Data insertion fail check once..." + result);
		}
	}
}
class ProductedMain5 {
	public static void main(String[] args) { 
		ProductDao dao = new ProductDao();
		Product product = dao.findById("PD2450");
		if(product!=null)
		{	System.out.println("Product Available...");
			System.out.println(product.getProId()+" "+product.getProName()+" "+product.getProPrice());
		}
		else
		{	System.out.println("Product is not available");	
		}
	}
}
class ProductedMain6 {
	public static void main(String[] args) { 
		ProductDao dao = new ProductDao();
		List<Product> products = dao.findAll();
		products.forEach(product->System.out.println(product));
	}
}
class ProductedMain7 {
	public static void main(String[] args) { 
		ProductDao dao = new ProductDao();
		int count = dao.updateProduct(200, 5);
		System.out.println("updated records count.."+count);
	}
}
class ProductedMain8 {
	public static void main(String[] args) { 
		ProductDao dao = new ProductDao();
		int count = dao.deleteProductById("PD2450");
		System.out.println("deleate records count.."+count);
	}
}
class ProductedMain9 {
	public static void main(String[] args) { 
		ProductDao dao = new ProductDao();
		int count = dao.deleteProductByPrice(200);
		System.out.println("deleate records count.."+count);
	}
}
	class ProductedMain10 
	{
		public static void main(String[] args) { 
			ProductDao dao = new ProductDao();
			int count = dao.droptable();
			System.out.println("Table is dropped status...."+count);
		}
	}







