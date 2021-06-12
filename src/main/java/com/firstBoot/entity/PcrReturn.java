package com.firstBoot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="pcr_return")
public class PcrReturn {
	
	@Id
	@Column(name="pcr_return_id")
	private int pcrReturnId;
	
	@Column(name="return_name")
	private String returnName;
	
	public int getPcrReturnId() {
		return pcrReturnId;
	}
	public void setPcrReturnId(int pcrReturnId) {
		this.pcrReturnId = pcrReturnId;
	}
	public String getReturnName() {
		return returnName;
	}
	public void setReturnName(String returnName) {
		this.returnName = returnName;
	}
	
}
