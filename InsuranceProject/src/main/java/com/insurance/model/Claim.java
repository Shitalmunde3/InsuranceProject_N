package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="claim_details")
public class Claim {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int claimId;
	private int policyId;
	private String claimStatus;
	private double claimAmount;
	private Integer userid;
	
	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getClaimId() {
		return claimId;
	}
	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getClaimStatus() {
		return claimStatus;
	}
	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}
	public double getClaimAmount() {
		return claimAmount;
	}
	public void setClaimAmount(double claimAmount) {
		this.claimAmount = claimAmount;
	}
	@Override
	public String toString() {
		return "ClaimDetails [id=" + id + ", claimId=" + claimId + ", policyId=" + policyId + ", claimStatus="
				+ claimStatus + ", claimAmount=" + claimAmount + "]";
	}
	
		
	
	

}
