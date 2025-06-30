package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.MedicationDTO;

@Repository
public class MedicationDAOImpl extends BaseDAOImpl<MedicationDTO>  implements MedicationDAOInt{
	
	@Override
	protected List<Predicate> getWhereClause(MedicationDTO dto, CriteriaBuilder builder, Root<MedicationDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<>();

		if (dto.getId() != null && dto.getId() > 0) {
			whereCondition.add(builder.equal(qRoot.get("id"), dto.getId()));
		}

		if (dto.getFullname() != null && !dto.getFullname().isEmpty()) {
			whereCondition.add(builder.like(qRoot.get("fullname"), dto.getFullname() + "%"));
		}
		
		
		  if (dto.getPrescriptiondate() != null) {
	            whereCondition.add(builder.equal(qRoot.get("prescriptiondate"), dto.getPrescriptiondate()));
	        }
		if (dto.getIllness() != null && !dto.getIllness().isEmpty()) {
			whereCondition.add(builder.like(qRoot.get("illness"), dto.getIllness() + "%"));
		}

		

		if (!isZeroNumber(dto.getDosage())) {
			whereCondition.add(builder.equal(qRoot.get("dosage"), dto.getDosage()));
		}

		

		return whereCondition;

		// return null;
	}

	@Override
	public Class<MedicationDTO> getDTOClass() {
		return MedicationDTO.class;
	}



}
