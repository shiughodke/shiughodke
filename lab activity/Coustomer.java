package com.Sprint1.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="cust_details")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor


//customer entity
public class Coustomer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	
	@Column(length = 10, nullable = false)
	private String cfname;
	
	@Column(length = 10, nullable = false)
	private String clname;
	
	@Column(length = 30, nullable = false,unique = true)
	private String cemail;
	
	@Column(length = 20, nullable = false)
	private String caddr;
	
	@Column(length = 10, nullable = false, unique = true)
	private long cphone;
	
 // @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
  // @JoinColumn(name="cid")
 //  private List<Orders>Orders;
   


	

}
