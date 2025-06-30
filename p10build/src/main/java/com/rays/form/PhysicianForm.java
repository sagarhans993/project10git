package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CartDTO;
import com.rays.dto.PhysicianDTO;

public class PhysicianForm extends BaseForm{

	
	@NotEmpty(message = "Please enter fullname")
 	private String fullname;

	 
	@NotNull(message = "Please enter birthdate")
	private Date birthdate;
	
	@NotEmpty(message = "Please enter phone")
 	private String phone;

	
	  @NotNull(message = "Please enter specialization")
	private String specialization;


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public @NotNull(message = "Please enter birthdate") Date getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(@NotNull(message = "Please enter birthdate") Date birthdate) {
		this.birthdate = birthdate;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public @NotNull(message = "Please enter specialization") String getSpecialization() {
		return specialization;
	}


	public void setSpecialization(@NotNull(message = "Please enter specialization") String specialization) {
		this.specialization = specialization;
	}

	
	
	@Override
	public BaseDTO getDto() {
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		PhysicianDTO dto = initDTO(new PhysicianDTO());
		 dto.setFullname(fullname);
		 
		/*
		 * if (requiredexperience != null && !requiredexperience.isEmpty()) {
		 * dto.setRequiredexperience(Long.valueOf(requiredexperience)); }
		 */
		dto.setBirthdate(birthdate);
		
		dto.setPhone(phone);
		
		dto.setSpecializatiion(specialization);
		
	

		return dto;
}
}
