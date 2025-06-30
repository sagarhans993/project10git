package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.FollowDTO;

@Repository
public class FollowDAOImpl extends BaseDAOImpl<FollowDTO> implements FollowDAOInt{
	@Override
	protected List<Predicate> getWhereClause(FollowDTO dto, CriteriaBuilder builder, Root<FollowDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<>();

		if (dto.getId() != null && dto.getId() > 0) {
			whereCondition.add(builder.equal(qRoot.get("id"), dto.getId()));
		}

		if (dto.getPatient() != null && !dto.getPatient().isEmpty()) {
			whereCondition.add(builder.like(qRoot.get("patient"), dto.getPatient() + "%"));
		}
		
		
		  if (dto.getVisitedate() != null) {
	            whereCondition.add(builder.equal(qRoot.get("visitedate"), dto.getVisitedate()));
	        }
		if (dto.getDoctor() != null && !dto.getDoctor().isEmpty()) {
			whereCondition.add(builder.like(qRoot.get("doctor"), dto.getDoctor() + "%"));
		}

		

		if (!isZeroNumber(dto.getFees())) {
			whereCondition.add(builder.equal(qRoot.get("fees"), dto.getFees()));
		}

		

		return whereCondition;

		// return null;
	}

	@Override
	public Class<FollowDTO> getDTOClass() {
		return FollowDTO.class;
	}



}
