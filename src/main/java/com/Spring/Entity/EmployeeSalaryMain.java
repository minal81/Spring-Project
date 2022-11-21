package com.Spring.Entity;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EmployeeSalaryMain {

	public static void main(String[] args) {
		
		JFrame jp = new JFrame();
		System.out.println("******************WELCOME*****************");
		System.out.println("\nSelect Below Menu To Perfrom The Operation");
		System.out.println("1.Employee");
		System.out.println("2.Salary");
		int option = Integer.parseInt(JOptionPane.showInputDialog(jp, "Enter your Choice:"));
		while(option != 3) {
			switch (option) {
			case 1: {
				
				//Employee operation
				System.out.println("\n\n1.Insert Employee Details");
				System.out.println("2.View All Employee");
				System.out.println("3.View Specific Employee");
				System.out.println("4.Update Employee Details");
				System.out.println("5.Delete Employee Details");
				int option1 = Integer.parseInt(JOptionPane.showInputDialog(jp, "Enter your Choice:"));
				
				EmployeeLogic es2 = new EmployeeLogic();
				
				switch (option1) {
				case 1: {
					es2.addEmployee();
					break;
				}
				case 2: {
					
					es2.viewAll();
					break;
				}
				case 3: {
					es2.viewEmployees();
					
					break;
				}
				case 4: {
					es2.updateEmployeesName();
					break;
				}
				case 5: {
					es2.deleteEmployees();
					break;
				}
				default: {
					System.out.println("Invalid Choice");
				
				}
				}
			

				break;
			}
			case 2: {
				
				//Salary operation
				System.out.println("\n1.Insert Salary to Employee");
				System.out.println("2.View All Employee Salary");
				System.out.println("3.View Specific Employee Salary");
				System.out.println("4.Add Bonus To Employee");
				System.out.println("5.delete  Employee Salary Details");
				int option2 = Integer.parseInt(JOptionPane.showInputDialog(jp, "Enter your Choice:"));
				SalaryLogic sl1 = new SalaryLogic();
				switch (option2) {

				case 1: {
					sl1.addSalary();
					break;
				}
				case 2: {
					
					sl1.ViewAllSal();
					break;
				}
				case 3: {
					sl1.getSalUsingEmpId();
					
					break;
				}
				case 4: {
					sl1.addBonus();
					break;
				}
				case 5: {
					sl1.deleteSalAcc();
					break;
				}
				default: {
					System.out.println("Invalid Choice");
					break;
				}

				}

				break;
			}
			default:
				System.out.println("Invalid Choice");
				
			}
			
		}
	}
	}

