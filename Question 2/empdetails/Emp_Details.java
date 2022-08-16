/*Develop an application using JPA
try to insert employee Information(empno,name,designation,sal ..etc) into database
and also fetch all the data from the database then display on console*/

package com.java.jpa.empdetails;

import java.util.List;

import javax.persistence.*;

import com.java.jpa.employee.Employee;

public class Emp_Details {

	public static void main(String args[])

	{

		// Creating an entity manager factory object
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Employee_details");

		// Obtaining an entity manager from factory
		EntityManager em = emf.createEntityManager();

		// Intializing an entity manager
		em.getTransaction().begin();

		// Insert Employee information into database
		Employee e1 = new Employee();

		e1.setEmpno(101);

		e1.setName("Ajeet");

		e1.setDesignation("Trainee Engineer");

		e1.setSalary(27000);

		e1.setPno(919676786);

		Employee e2 = new Employee();

		e2.setEmpno(102);

		e2.setName("Barkha");

		e2.setDesignation("Developer");

		e2.setSalary(35000);

		e2.setPno(789654325);

		Employee e3 = new Employee();

		e3.setEmpno(103);

		e3.setName("Ujjwal");

		e3.setDesignation("Software Engineer");

		e3.setSalary(40000);

		e3.setPno(788725678);

		// Persisting a data into relational database
		em.persist(e1);

		em.persist(e2);

		em.persist(e3);

		// Closing the transaction
		em.getTransaction().commit();

		Query q = em.createQuery("from Employee");

		List<Employee> list = q.getResultList();
		for (Employee emp : list) {
			System.out.println(emp.getEmpno() + " " + emp.getName() + " " + emp.getDesignation() + " " + emp.getSalary()
					+ " " + emp.getPno());
		}

		// Releasing the factory resources
		emf.close();
		em.close();
	}

}