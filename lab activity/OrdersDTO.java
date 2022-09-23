package com.Sprint1.model;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor

public class OrdersDTO {
	@Id
	private int oid;
	
	@NotNull(message = "please enter quantity")
	private int quantity;
	
	@NotNull(message = "please enter price")
	private double price;
	
	@NotNull(message = "please enter orderdate")
	private String orderdate;

}
