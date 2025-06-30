package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name ="ST_PHYSICIAN")
public class PhysicianDTO extends BaseDTO{
	
	
	@Column (name ="FULLNAME")
	private String fullname;
	
	@Column (name = "BIRTHDATE")
	private Date birthdate;
	
	@Column (name ="PHONE")
     private String phone;
	
	@Column (name ="SPECIALIZATION")
	private String specialization;
	
	
	
	
	
	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSpecializatiion() {
		return specialization;
	}

	public void setSpecializatiion(String specializatiion) {
		this.specialization = specializatiion;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return "fullname";
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "fullname";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return id+"";
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "fullname";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("fullname", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("id", id);
		return map;
	}
	


}
