package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== TEST 1 : department findById ====");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n==== TEST 2 : department findAll ====");
		List<Department> list = departmentDao.findAll();
		for (Department dep1 : list) {
			System.out.println(dep1);
		}
		/*
		System.out.println("\n==== TEST 3 : department insert ====");
		Department newDepartment = new Department(null, "Books");
		departmentDao.insert(newDepartment);
		System.out.println("Insert! New id = " + newDepartment.getId());*/
		
		System.out.println("\n==== TEST 4 : department update ====");
		dep = departmentDao.findById(1);
		dep.setName("Games");
		departmentDao.update(dep);
		System.out.println("Update Completed");
		
		System.out.println("\\n==== TEST 5 : department deleted ====");
		System.out.print("Enter Id for deleted: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Deleted Completed");
		
		sc.close();
	}

}
