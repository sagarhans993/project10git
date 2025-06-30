package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.DoctorDTO;
import com.rays.dto.ProprietorDTO;

public class DoctorForm extends BaseForm{
 
	

	@NotEmpty(message = "Please enter the full Name")
    private String fullname;
	

	@NotEmpty(message = "Please enter the specialization")
    private String specialization;
	
	@NotEmpty(message = "Please enter the phone")
    private String phone;
	
	@NotNull(message = "Please enter the birth date")
    private Date birthdate;

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
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

	 
	
	
	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	@Override
    public BaseDTO getDto() {
        DoctorDTO dto = initDTO(new DoctorDTO());
        dto.setFullname(fullname);
        dto.setBirthdate(birthdate);
        dto.setSpecialization(specialization);
        dto.setPhone(phone);
        return dto;
    }
	
	
	

}
