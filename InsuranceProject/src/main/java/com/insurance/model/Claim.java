package com.insurance.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "claim")
public class Claim {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int claim_id;
	private int policy_id;
	private String claim_status;
	private double claim_amount;
	private Integer userid;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClaim_id() {
		return claim_id;
	}

	public void setClaim_id(int claim_id) {
		this.claim_id = claim_id;
	}

	public int getPolicy_id() {
		return policy_id;
	}

	public void setPolicy_id(int policy_id) {
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

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	
}
