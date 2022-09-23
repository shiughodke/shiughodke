package com.Sprint1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Table(name = "order_details")
@Entity
@Setter
@Getter
@AllArgsConstructor

//order entity
public class Orders {
	@Id
	private int oid;
	
	@Column(length =10)
	private String pname;
	
	private int quantity;
	
	private double price;
	
	@Column(length =10)
	private String orderdate;
	

}
