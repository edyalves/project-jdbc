package application;

import model.entities.Department;

public class Program {

	public static void main(String[] args) {

		Department Dep = new Department(5, "Recpção");
		
		System.out.println(Dep.toString());

	}

}
