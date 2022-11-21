package com.Spring.Entity;

import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmployeeLogic {
	Scanner sc = new Scanner(System.in);
	JFrame jp = new JFrame();
	EntityManagerFactory emf = null;
	EntityManager em = null;
	EntityTransaction et = null;

	// Import EntityManager factory to implement JPA and Hibernate
	{
		emf = Persistence.createEntityManagerFactory("ProjectUnit");

		em = emf.createEntityManager();
		et = em.getTransaction();
	}

	// To add the employee salary details
	public boolean addEmployee() {
		et.begin();
		Employee1 e1 = new Employee1();
		System.out.println("Enter Employee First name");
		String f_name = sc.next();
		e1.setE_F_name(f_name);
		System.out.println("Enter Employee Last name");
		String L_name = sc.next();
		e1.setE_L_name(L_name);

		System.out.println("Enter Employee Date of birth(dd/mm/yyyy)");
		String DOB = sc.next();
		e1.setE_DOB(DOB);

		System.out.println("Enter Employee Gender(M/F)");
		char Gender = sc.next().charAt(0);
		e1.setE_Gender(Gender);

		System.out.println("Enter Employee City");
		String City = sc.next();
		e1.setE_City(City);

		System.out.println("Enter Employee Phone");
		long phone = sc.nextLong();
		e1.setE_Phone(phone);

		System.out.println("Enter Employee Designation");
		String Designation = sc.next();
		e1.setE_Designation(Designation);

		System.out.println("Enter Employee Department");
		String Department = sc.next();
		e1.setE_Department(Department);

		System.out.println("Enter Employee date of joining(dd/mm/yyyy");
		String DOJ = sc.next();
		e1.setE_DOJ(DOJ);

		System.out.println("Enter Employee Grade");
		char Grade = sc.next().charAt(0);
		e1.setE_Grade(Grade);

		em.persist(e1);
		// sc.close();
		et.commit();

		JOptionPane.showMessageDialog(jp, "Succeussfully Inserted..", "Alert", JOptionPane.INFORMATION_MESSAGE);
		return true;
	}

	// view the Employee using id
	public void viewEmployees() {
		et.begin();
		System.out.println("Employee Id");
		int id = sc.nextInt();
		Employee1 f1 = em.find(Employee1.class, id);
		System.out.println("\n**************************Employee Details**************************");
		System.out.println("--------------------------------------------------------------------- ");
		System.out.println("\nEmployee f_name: " + f1.getE_F_name());
		System.out.println("Employee L_name: " + f1.getE_L_name());
		System.out.println("Employee City: " + f1.getE_City());
		System.out.println("Employee Department: " + f1.getE_Department());
		System.out.println("Employee DEsignation: " + f1.getE_Designation());
		// sc.close()?

		et.commit();
	}

	// Update employee details
	public boolean updateEmployeesName() {
		et.begin();
		// Employee1 e1 = new Employee1();
		System.out.println("Employee Id");
		int id = sc.nextInt();
		Employee1 f1 = em.find(Employee1.class, id);
		System.out.println("\nEnter employee first name to change :- ");
		String changeFName = sc.next();
		f1.setE_F_name(changeFName);

		System.out.println("Enter employee last name to change :- ");
		String changeLName = sc.next();
		f1.setE_L_name(changeLName);
		em.persist(f1);
		et.commit();
		JOptionPane.showMessageDialog(jp, "Succeussfully Updated..", "Alert", JOptionPane.INFORMATION_MESSAGE);
		return true;
	}

	// Delete employee details using id
	public void deleteEmployees() {
		et.begin();
		System.out.println("\nEmployee Id to Delete the Employee details");
		int id = sc.nextInt();
		Employee1 e4 = em.find(Employee1.class, id);
		em.remove(e4);

		et.commit();
		JOptionPane.showMessageDialog(jp, "Succeussfully Deleted..", "Alert", JOptionPane.INFORMATION_MESSAGE);

	}

	// Custom query to view all the data
	public boolean viewAll() {
		@SuppressWarnings("unchecked")
		List<Employee1> listEmployee = em.createQuery("SELECT e FROM Employee1 e").getResultList();
		if (listEmployee == null) {
			System.out.println("No employee found . ");
		} else {
			System.out.println("\n\t************************Employee Details************************ ");
			System.out.println("--------------------------------------------------------------------");
			System.out.println("Employee id \t\tEmployee firstName\t\t Employee LastName ");

			for (Employee1 empl : listEmployee) {
				System.out.println(empl.getE_id() + "\t\t\t " + empl.getE_F_name() + "\t\t\t " + empl.getE_L_name());
			}
		}
		return true;
	}

}
