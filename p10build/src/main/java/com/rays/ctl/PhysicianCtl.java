package com.rays.ctl;

import org.hibernate.loader.plan.spi.Return;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
 import com.rays.dto.PhysicianDTO;
import com.rays.form.PhysicianForm;
import com.rays.service.PhysicianServiceInt;


@RestController
@RequestMapping(value = "physician")

public class PhysicianCtl extends BaseCtl<PhysicianForm, PhysicianDTO, PhysicianServiceInt>{

	
	Return res;
}
