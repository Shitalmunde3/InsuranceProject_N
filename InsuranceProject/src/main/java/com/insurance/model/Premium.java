package com.insurance.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="premium")
public class Premium {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int premium_Id;
	private int policy_Id;
	private String policy_Holder_Name;
	private double installment_Premium_Amount;
	private Date policy_commencement_date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPremium_Id() {
		return premium_Id;
	}

	public void setPremium_Id(int premium_Id) {
		this.premium_Id = premium_Id;
	}

	public int getPolicy_Id() {
		return policy_Id;
	}

	public void setPolicy_Id(int policy_Id) {
		this.policy_Id = policy_Id;
	}

	public String getPolicy_Holder_Name() {
		return policy_Holder_Name;
	}

	public void setPolicy_Holder_Name(String policy_Holder_Name) {
		this.policy_Holder_Name = policy_Holder_Name;
	}

	public double getInstallment_Premium_Amount() {
		return installment_Premium_Amount;
	}

	public void setInstallment_Premium_Amount(double installment_Premium_Amount) {
		this.installment_Premium_Amount = installment_Premium_Amount;
	}

	public void setPolicy_commencement_date(Date policy_commencement_date) {
		this.policy_commencement_date = policy_commencement_date;
	}

	public Date getPolicy_commencement_date() {
		return policy_commencement_date;
	}
}
