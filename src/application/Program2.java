package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		Department depart = new Department();
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("========INSERT========");
		Department dep = new Department(null, "DEP COZINHA");
		depDao.insert(dep);
		System.out.println("Insert new department");
		*/
		
		System.out.println("/n========FIND BY ID========");
		depart = depDao.findById(3);
		System.out.println(depart);
		
		System.out.println("/n========UPDATE========");
		Department update = depDao.findById(1);
		update.setName("Computing");
		depDao.update(update);
		System.out.println("Update completed!");
		
		System.out.println("/n========FIND ALL========");
		List<Department> list = depDao.findAll();
		for(Department dep : list) {
			System.out.println(dep);
		}
		
		System.out.println("/n========FIND ALL========");
		System.out.println("Enter id for delete: ");
		int n = sc.nextInt();
		depDao.deleteById(n);
		System.out.println("Delete department id : " + n);
	}

}
