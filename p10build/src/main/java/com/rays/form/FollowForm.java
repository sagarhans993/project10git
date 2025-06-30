package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CartDTO;
import com.rays.dto.FollowDTO;

public class FollowForm extends BaseForm{
	
	
	@NotEmpty(message = "Please enter patient")
 	private String patient;

	@NotEmpty(message = "Please enter doctor")
	private String doctor;
	
	public String getDoctor() {
		return doctor;
	}



	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}



	@NotNull(message = "Please enter fees")
	private Long fees;
	
	
	  @NotNull(message = "Please enter visitedate")
	private Date visitedate;


	  
	  public String getPatient() {
		return patient;
	}



	public void setPatient(String patient) {
		this.patient = patient;
	}



	 



	public Long getFees() {
		return fees;
	}



	public void setFees(Long fees) {
		this.fees = fees;
	}



	public Date getVisitedate() {
		return visitedate;
	}



	public void setVisitedate(Date visitedate) {
		this.visitedate = visitedate;
	}



	@Override
		public BaseDTO getDto() {
			// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			FollowDTO dto =new FollowDTO();
			 dto.setPatient(patient);
			 
		 
			dto.setDoctor(doctor);
			
			dto.setVisitedate(visitedate);
			
			dto.setFees(fees);
			
		

			return dto;
		}
		
		

}
