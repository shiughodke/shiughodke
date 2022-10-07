package com.Sprint2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "stud__detalis")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor


public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
     private int sid;
	
	@Column(length = 10, nullable = false)
	private String fname;
	
	@Column(length = 10, nullable = false)
    private String lname;
	
	@Column(length = 30, nullable = false,unique = true)
    private String semail;
	
	@Column(length = 30, nullable = false)
	private String saddres;
	
	@Column(length = 30, nullable = false,unique = true)
	private long sphone;
 
}
