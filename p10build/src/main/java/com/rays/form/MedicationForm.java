package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CartDTO;
import com.rays.dto.MedicationDTO;

public class MedicationForm extends BaseForm{
	
	@NotEmpty(message = "Please enter fullname")
 	private String fullname;

	@NotEmpty(message = "Please enter illness")
	private String illness;
	
	@NotNull(message = "Please enter dosage")
	private long dosage;
	
	
	  @NotNull(message = "Please enter prescriptiondate")
	private Date prescriptiondate;


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


	


	public long getDosage() {
		return dosage;
	}


	public void setDosage(long dosage) {
		this.dosage = dosage;
	}


	public Date getPrescriptiondate() {
		return prescriptiondate;
	}


	public void setPrescriptiondate(Date prescriptiondate) {
		this.prescriptiondate = prescriptiondate;
	}


	@Override
	public BaseDTO getDto() {
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		MedicationDTO dto = initDTO(new MedicationDTO());
		 dto.setFullname(fullname);
		 
		/*
		 * if (requiredexperience != null && !requiredexperience.isEmpty()) {
		 * dto.setRequiredexperience(Long.valueOf(requiredexperience)); }
		 */
		dto.setIllness(illness);
		
		dto.setDosage(dosage);
		
		dto.setPrescriptiondate(prescriptiondate);
		
	

		return dto;
}
}