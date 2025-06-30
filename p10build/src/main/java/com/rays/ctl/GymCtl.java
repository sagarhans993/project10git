package com.rays.ctl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
 import com.rays.dto.GymDTO;
import com.rays.dto.OwnerDTO;
import com.rays.form.GymForm;
import com.rays.service.GymServiceInt;

@RestController
@RequestMapping(value = "Gym")
public class GymCtl extends BaseCtl<GymForm, GymDTO, GymServiceInt> {

	

	@GetMapping("/preload")
    public ORSResponse preload() {
        System.out.println("Inside preload");
        ORSResponse res = new ORSResponse(true);
        GymDTO dto = new GymDTO();
        List list = new ArrayList<>();
	    list.add("Male");
	    list.add("Female");
	    
         res.addResult("gymList1", list);
         
        return res;
    }

}
