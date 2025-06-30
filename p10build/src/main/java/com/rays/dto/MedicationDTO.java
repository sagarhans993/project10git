package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_MEDICATION")
public class MedicationDTO extends BaseDTO {

	@Column(name = "FULLNAME")
	private String fullname;
	
	
	@Column (name ="ILLNESS")
	private String illness;
	
	@Column (name = "PRESCRIPTIONDATE")
	private Date prescriptiondate;
	
	@Column (name ="DOSAGE")
	private long dosage;

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getIllness() {
		return illness;
	}

	public void setIllness(String illness) {
		this.illness = illness;
	}

	public Date getPrescriptiondate() {
		return prescriptiondate;
	}

	public void setPrescriptiondate(Date prescriptiondate) {
		this.prescriptiondate = prescriptiondate;
	}

	
	
	public long getDosage() {
		return dosage;
	}

	public void setDosage(long dosage) {
		this.dosage = dosage;
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
