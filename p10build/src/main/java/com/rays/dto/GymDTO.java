package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.rays.common.BaseDTO;

 
@Entity
@Table(name = "ST_GYM")
public class GymDTO extends BaseDTO {

	@Column(name = "FRISTNAME", length = 20)
	private String fristName;

	@Column(name = "LASTNAME", length = 20)
	private String lastName;

	@Column(name = "GENDER")
	private String gender;// preload

	@Column(name = "DOB")
	private Date dob;//  

	public String getFristName() {
		return fristName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	 

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return "fristName";
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "fristName";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return id+"";
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "fristName";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("fristName", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("id", id);
		return map;
	}

}
