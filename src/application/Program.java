package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department Dep = new Department(5, "Recpção");
		
		Seller seller = new Seller(11, "Pessoa 1", "Pessoa1@email.com", new Date(), 15000.00, Dep);
		
		System.out.println(seller);

	}

}
