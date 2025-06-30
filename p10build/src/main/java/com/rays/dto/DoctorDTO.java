package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;


@Entity
@Table(name="st_Doctor")
public class DoctorDTO extends BaseDTO{
	
	@Column(name="FULLNAME")
	private String fullname;
	
	@Column(name="BIRTHDATE")
	private Date birthdate;
	
	@Column(name="SPECIALIZATION")
	private String specialization;
	
	@Column(name="PHONE")
	private String phone;

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

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
    public String getValue() {
        return fullname;
    }

    @Override
    public String getUniqueKey() {
        return "fullname";
    }

    @Override
    public String getUniqueValue() {
        return id + "";
    }

    @Override
    public String getLabel() {
        return "fullname";
    }

    @Override
    public LinkedHashMap<String, String> orderBY() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("fullname", "asc");
        return map;
    }

    @Override
    public LinkedHashMap<String, Object> uniqueKeys() {
        LinkedHashMap<String, Object> map = new LinkedHashMap<>();
        map.put("id", id);
        return map;
    }
	
	
	

}
