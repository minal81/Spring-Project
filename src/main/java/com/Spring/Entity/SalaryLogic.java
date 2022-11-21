package com.Spring.Entity;

import java.util.List;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SalaryLogic {
	JFrame jp = new JFrame();
	Scanner sc = new Scanner(System.in);
	//Import EntityManager factory to implement JPA and Hibernate
	EntityManagerFactory emf = null;
	EntityManager em = null;
	EntityTransaction et = null;
	{
		emf = Persistence.createEntityManagerFactory("ProjectUnit");
		em = emf.createEntityManager();
		et = em.getTransaction();
	}
	

	// To add the employee salary details
	public void addSalary() {
		et.begin();
		Salary1 add = new Salary1();
		System.out.println("\nEnter Employee id :- ");
		int e_id = sc.nextInt();
		add.setE_id(e_id);
		System.out.println("Enter paid date :- ");
		String p_date = sc.next();
		add.setPaid_Date(p_date);
		System.out.println("Enter amount paid :- ");
		double amountPaid = sc.nextDouble();
		add.setAmount_Paid(amountPaid);
		System.out.println("Enter Slip number :- ");
		int SlipNumber = sc.nextInt();
		add.setSlip_no(SlipNumber);
		em.persist(add);
		et.commit();
		JOptionPane.showMessageDialog(jp, "Succeussfully Inserted..", "Alert", JOptionPane.INFORMATION_MESSAGE);
	}

	// Retrive the salary using  id
	public boolean getSalUsingEmpId() {
		et.begin();
		System.out.println("\nEnter your employee_id:-");
		int id = sc.nextInt();
		Salary1 add1 = em.find(Salary1.class, id);
		System.out.println("\n**********************Employee Salary Details************************ ");
		System.out.println("----------------------------------------------------------------------- ");
		System.out.println("\n Employee Id:\t " + add1.getE_id());
		System.out.println("Salary_Id:\t " + add1.getS_Id());
		System.out.println("Salary Slip number :\t " + add1.getSlip_no());
		System.out.println("Paid date :\t " + add1.getPaid_Date());
		System.out.println("Amount Paid :\t " + add1.getAmount_Paid());
		et.commit();
		return true;
	}

	// Custom query to show the all data
	public boolean ViewAllSal() {
		et.begin();
		@SuppressWarnings("unchecked")
		List<Salary1> listEmployee = em.createQuery("SELECT e FROM Salary1 e").getResultList();

		if (listEmployee == null) {
			System.out.println("No Salary details found . ");
		} else {
			System.out.println("\n**********************Employee Salary Details************************");
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Employee id \t\tSalary Paid\t\t       Salary ");

			for (Salary1 empl : listEmployee) {
				System.out.println(empl.getE_id() + "\t\t\t " + empl.getPaid_Date() + "\t\t\t" + empl.getAmount_Paid());
			}
		}

		et.commit();
		return true;
	}

	// Add bonus to the employee
	public void addBonus() {
		et.begin();
		System.out.println("\nEnter your employee_id:-");
		int id = sc.nextInt();
		Salary1 add2 = em.find(Salary1.class, id);
		System.out.println("Enter Bonus Amount");
		double bonus = sc.nextDouble() + add2.getAmount_Paid();
		add2.setAmount_Paid(bonus);
		em.persist(add2);

		et.commit();
		JOptionPane.showMessageDialog(jp, "Succeussfully Add Bonus..", "Alert", JOptionPane.INFORMATION_MESSAGE);
	}

	// Delete employee  salary details using employee id
	public void deleteSalAcc() {
		et.begin();
		System.out.println("\nEmployee Id to Delete the Salary details");
		int id = sc.nextInt();
		Salary1 del2 = em.find(Salary1.class, id);
		em.remove(del2);
		et.commit();
		JOptionPane.showMessageDialog(jp, "Succeussfully Deleted..", "Alert", JOptionPane.INFORMATION_MESSAGE);
	}

}
