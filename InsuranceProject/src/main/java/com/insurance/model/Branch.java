package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="branch_details")
public class Branch {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int branchId;
	private String branchCode;
	private String branchName;
	private String IFSCcode;
	private String branchPhoneNo;
	private String address;
	private String MicrCode;
	
	
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getIFSCcode() {
		return IFSCcode;
	}
	public void setIFSCcode(String iFSCcode) {
		IFSCcode = iFSCcode;
	}
	public String getBranchPhoneNo() {
		return branchPhoneNo;
	}
	public void setBranchPhoneNo(String branchPhoneNo) {
		this.branchPhoneNo = branchPhoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMicrCode() {
		return MicrCode;
	}
	public void setMicrCode(String micrCode) {
		MicrCode = micrCode;
	}
	@Override
	public String toString() {
		return "Branch [branchCode=" + branchCode + ", branchName=" + branchName + ", IFSCcode=" + IFSCcode
				+ ", branchPhoneNo=" + branchPhoneNo + ", address=" + address + ", MicrCode=" + MicrCode + "]";
	}
	
	
	

}
