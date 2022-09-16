package com.HbOnetoManyUni.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Students {
	
	@Id
	private int aid;
	@Column(length =20, nullable = false)
	private String name;
	@Column(length =20, nullable = false, unique = true)
	private String email;
	@Column(length =20, nullable = false , unique = true)

	private long phone;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	

}
