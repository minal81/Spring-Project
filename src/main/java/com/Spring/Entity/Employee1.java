package com.Spring.Entity;




import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee1 {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="E_id")
	private int e_id;
	
	@Column(name="E_F_name")
	private String e_F_name;
	
	@Column(name="E_L_name")
	private String e_L_name;
	
	@Column(name="E_DOB")
	private String e_DOB;
	
	@Column(name="E_Gender")
	private char e_Gender;
		
	@Column(name="E_City")
	private String e_City;
	
	@Column(name="E_Phone")
	private long e_Phone;
	
	@Column(name="E_Designation")
	private String e_Designation;
	
	@Column(name="E_Department")
	private String e_Department;
	
	@Column(name="E_Doj")
	private String e_DOJ;
	
	@Column(name="E_Grade")
	private char e_Grade;
	
	
	//one to one unidirectional mapping
	@OneToOne(cascade = CascadeType.ALL )

    @JoinColumn(name = "S_Id")
	
	private Salary1 salaries;
	

	public Salary1 getSalaries() {
		return salaries;
	}

	public void setSalaries(Salary1 salaries) {
		this.salaries = salaries;
	}

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getE_F_name() {
		return e_F_name;
	}

	public void setE_F_name(String e_F_name) {
		this.e_F_name = e_F_name;
	}

	public String getE_L_name() {
		return e_L_name;
	}

	public void setE_L_name(String e_L_name) {
		this.e_L_name = e_L_name;
	}

	public String getE_DOB() {
		return e_DOB;
	}

	public void setE_DOB(String e_DOB) {
		this.e_DOB = e_DOB;
	}

	public char getE_Gender() {
		return e_Gender;
	}

	public void setE_Gender(char e_Gender) {
		this.e_Gender = e_Gender;
	}
	public String getE_City() {
		return e_City;
	}

	public void setE_City(String e_City) {
		this.e_City = e_City;
	}

	public long getE_Phone() {
		return e_Phone;
	}

	public void setE_Phone(long e_Phone) {
		this.e_Phone = e_Phone;
	}

	public String getE_Designation() {
		return e_Designation;
	}

	public void setE_Designation(String e_Designation) {
		this.e_Designation = e_Designation;
	}

	public String getE_Department() {
		return e_Department;
	}

	public void setE_Department(String e_Department) {
		this.e_Department = e_Department;
	}

	public String getE_DOJ() {
		return e_DOJ;
	}

	public void setE_DOJ(String e_DOJ) {
		this.e_DOJ = e_DOJ;
	}

	public char getE_Grade() {
		return e_Grade;
	}

	public void setE_Grade(char e_Grade) {
		this.e_Grade = e_Grade;
	}
	
	
	
}

