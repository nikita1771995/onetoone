package com.cjc.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mobno {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private int mo_id;
	private String mob_no;

	
	public int getMo_id() {
		return mo_id;
	}

	public void setMo_id(int mo_id) {
		this.mo_id = mo_id;
	}

	public String getMob_no() {
		return mob_no;
	}

	public void setMob_no(String mob_no) {
		this.mob_no = mob_no;
	}

}
