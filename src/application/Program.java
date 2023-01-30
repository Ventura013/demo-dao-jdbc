package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dp = new Department(10, "Books");
		
		System.out.println(dp);
		
		Seller seller =  new Seller(17, "Diego", "diego@gmail.com", new Date(), 6000.00, dp);
		
		System.out.println(seller);

	}

}
