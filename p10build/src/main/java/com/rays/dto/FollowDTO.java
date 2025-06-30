package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table (name ="ST_FOLLOW")
public class FollowDTO  extends BaseDTO{
	
	@Column (name ="PATIENT")
     private String patient;
	
	@Column (name= "DOCTOR")
	private String doctor;
	
	@Column( name = "VISITEDATE")
	private Date visitedate;
	
	@Column (name ="FEES")
	private Long fees;

	public String getPatient() {
		return patient;
	}

	public void setPatient(String patient) {
		this.patient = patient;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public Date getVisitedate() {
		return visitedate;
	}

	public void setVisitedate(Date visitedate) {
		this.visitedate = visitedate;
	}

	public Long getFees() {
		return fees;
	}

	public void setFees(Long fees) {
		this.fees = fees;
	}
	
	
	
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return "patient";
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "patient";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return id+"";
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "patient";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("patient", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("id", id);
		return map;
	}
	

	
	
	
	
	
}
