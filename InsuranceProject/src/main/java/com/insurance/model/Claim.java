package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="claim")
public class Claim {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	private double Claim_id;
	private double policy_id;
	private String claim_status;
	private double claim_amount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getClaim_id() {
		return Claim_id;
	}
	public void setClaim_id(double claim_id) {
		Claim_id = claim_id;
	}
	public double getPolicy_id() {
		return policy_id;
	}
	public void setPolicy_id(double policy_id) {
		this.policy_id = policy_id;
	}
	public String getClaim_status() {
		return claim_status;
	}
	public void setClaim_status(String claim_status) {
		this.claim_status = claim_status;
	}
	public double getClaim_amount() {
		return claim_amount;
	}
	public void setClaim_amount(double claim_amount) {
		this.claim_amount = claim_amount;
	}

	

}
