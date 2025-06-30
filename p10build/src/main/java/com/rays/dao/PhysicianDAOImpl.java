package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
 import com.rays.dto.PhysicianDTO;

@Repository
public class PhysicianDAOImpl extends BaseDAOImpl<PhysicianDTO> implements PhysicianDAOInt{

	
	@Override
	protected List<Predicate> getWhereClause(PhysicianDTO dto, CriteriaBuilder builder, Root<PhysicianDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<>();

		if (dto.getId() != null && dto.getId() > 0) {
			whereCondition.add(builder.equal(qRoot.get("id"), dto.getId()));
		}

		if (dto.getFullname() != null && !dto.getFullname().isEmpty()) {
			whereCondition.add(builder.like(qRoot.get("fullname"), dto.getFullname() + "%"));
		}
		
		
		  if (dto.getBirthdate() != null) {
	            whereCondition.add(builder.equal(qRoot.get("birthdate"), dto.getBirthdate()));
	        }
		if (dto.getPhone() != null && !dto.getPhone().isEmpty()) {
			whereCondition.add(builder.like(qRoot.get("phone"), dto.getPhone() + "%"));
		}


		if (dto.getSpecializatiion() != null && !dto.getSpecializatiion().isEmpty()) {
			whereCondition.add(builder.like(qRoot.get("specializatiion"), dto.getSpecializatiion() + "%"));
		}
 
		

		return whereCondition;

		// return null;
	}

	@Override
	public Class<PhysicianDTO> getDTOClass() {
		return PhysicianDTO.class;
	}


}
