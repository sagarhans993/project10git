package com.rays.ctl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.loader.plan.spi.Return;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
 import com.rays.dto.DoctorDTO;
import com.rays.form.DoctorForm;
import com.rays.service.DoctorServiceInt;


@RestController
@RequestMapping(value = "Doctor")
public class DoctorCtl extends BaseCtl<DoctorForm, DoctorDTO, DoctorServiceInt>{
	
	

	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("Inside preload");
		ORSResponse res = new ORSResponse(true);
		DoctorDTO dto = new DoctorDTO();
		List list = new ArrayList<>();
		list.add("Heart");
		list.add("Cencer");
		list.add("Fiver");
		res.addResult("specialization", list);

		/*
		 * List list1 = new ArrayList<>(); list1.add("2020-01-01");
		 * list1.add("2015-03-09"); list1.add("2010-10-09");
		 * res.addResult("Cartlist2", list1);
		 */

		return res;
	}

}

	
 

