package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.GymDTO;

public class GymForm extends BaseForm {

	@NotEmpty(message = "Please enter fristName")
	private String fristName;

	@NotEmpty(message = "Please enter lastName")
	private String lastName;

	@NotEmpty(message = "Please enter gender")
	private String gender;

	@NotNull(message = "Please enter dob")
	private Date dob;

	



	public String getFristName() {
		return fristName;
	}

	 

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	public String getLastName() {
		return lastName;
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
	public BaseDTO getDto() {
		GymDTO dto = initDTO(new GymDTO());
		dto.setFristName(fristName);
		dto.setLastName(lastName);

		dto.setGender(gender);

		dto.setDob(dob);

		return dto;
	}

}
