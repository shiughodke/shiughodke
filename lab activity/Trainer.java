package com.HbOnetoManyUni.Entity;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Trainer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tid;
	@Column(length = 20, nullable = false)
	private String tname;
	@Column(length = 20, nullable = false)
	private String cname;
	@Column(length = 20, nullable = false)
	private String designation;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "tid")
	private List<Students> students;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public List<Students>getStudents (){
		return students;
	}
   public void setStudents(List<Students> students) {
	   this.students = students;
   }
}
