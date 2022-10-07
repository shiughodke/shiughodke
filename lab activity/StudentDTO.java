package com.Sprint2.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class StudentDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	
	@NotNull(message = "please enter fname ")
	@Size(min=2,message = "name should be atleast two character")
	private String fname;
	
    @NotNull(message = "please enter surname")
    @Size(min = 3, message = "name should be atleast three character")
    private String lname;
    
    @NotNull(message ="please enter email id")
    @Email(message = "please enter proper email id")
	private String semail;
    
    @NotNull(message ="please enter address")
    @Size(min = 15, message ="name should be atleast ten character")
	private String saddr;
    
    @NotNull(message = "please enter phone")
    @Size(min = 10, max = 12)
	private long sphone;
	
}
