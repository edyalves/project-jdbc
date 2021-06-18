package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("============ TEST1 =============");
		Seller seller = sellerDao.findById(1);		
		System.out.println(seller);
		
		System.out.println("============ TEST2 =============");
		Department depart = new Department(4, null);
		List<Seller> list = sellerDao.findByDepartment(depart);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("============ TEST3 =============");
		List<Seller> list1 = sellerDao.findAll();
		for (Seller obj1 : list1) {
			System.out.println(obj1);
		}
		
		System.out.println("============ TEST4 =============");
		Seller newSeller = new Seller(null, "Pessoa 3", "pessoa3@email.com", new Date(), 15000.0, depart);
		sellerDao.insert(newSeller);
		System.out.println("Inserted id key: " + newSeller.getId());
		
		System.out.println("============ TEST5 =============");
		//CARREGAR TARGET
		seller = sellerDao.findById(2);
		seller.setName("Pessoa 4");
		sellerDao.update(seller);
		System.out.println("Update name for: " + seller.getName());
	}

}
