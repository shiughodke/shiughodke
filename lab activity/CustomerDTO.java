package com.Sprint1.model;

import java.util.List;

import com.Sprint1.entity.Orders;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class CustomerDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	
	@NotNull(message = "please enter name ")
	@Size(min=2,message = "name should be atleast two character")
	private String cfname;
	
    @NotNull(message = "please enter surname")
    @Size(min = 3, message = "name should be atleast three character")
    private String clname;
    
    @NotNull(message ="please enter email id")
    @Email(message = "please enter proper email id")
	private String cemail;
    
    @NotNull(message ="please enter address")
    @Size(min = 15, message ="name should be atleast ten character")
	private String caddr;
    
    @NotNull(message = "please enter phone")
    @Size(min = 10, max = 12)
	private long cphone;
	
   
   private List<Orders>Orders;
   
}
