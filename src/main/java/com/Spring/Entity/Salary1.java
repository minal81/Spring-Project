package com.Spring.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name="Salary")
public class Salary1 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="S_Id")
	private int s_Id;
	
	@Column(name="Slip_no")
	private int slip_no;
	
	@Column(name="Paid_Date")
	private String paid_Date;
	
	@Column(name="Amount_Paid")
	private double amount_Paid;
	
	//foreign key 
	private int E_id;
	
	public int getE_id() {
		return E_id;
	}

	public void setE_id(int e_id) {
		E_id = e_id;
	}

	public int getS_Id() {
		return s_Id;
	}

	public void setS_Id(int s_Id) {
		this.s_Id = s_Id;
	}

	public int getSlip_no() {
		return slip_no;
	}

	public void setSlip_no(int slip_no) {
		this.slip_no = slip_no;
	}

	public String getPaid_Date() {
		return paid_Date;
	}

	public void setPaid_Date(String paid_Date) {
		this.paid_Date = paid_Date;
	}

	public double getAmount_Paid() {
		return amount_Paid;
	}

	public void setAmount_Paid(double d) {
		this.amount_Paid = d;
	}

}


