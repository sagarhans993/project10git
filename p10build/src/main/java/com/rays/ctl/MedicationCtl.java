package com.rays.ctl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.MedicationDTO;
import com.rays.form.MedicationForm;
import com.rays.service.MedicationServiceInt;

@RestController
@RequestMapping(value = "Medication")
public class MedicationCtl extends BaseCtl<MedicationForm, MedicationDTO, MedicationServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);

		HashMap<Integer, String> Map = new HashMap<>();
		Map.put(1, "Red");
		Map.put(2, "Blue");
		Map.put(3, "Green");
		Map.put(4, "Black");

		List<Map<String, Object>> medicationList = new ArrayList<>();
		Map.forEach((key, value) -> {
			Map<String, Object> item = new HashMap<>();
			item.put("key", key);
			item.put("value", value);
			medicationList.add(item);
		});

		res.addResult("medicationList", medicationList);

		return res;
	}

}
