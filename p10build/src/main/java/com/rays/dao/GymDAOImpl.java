package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.GymDTO;

@Repository
public class GymDAOImpl extends BaseDAOImpl<GymDTO> implements GymDAOInt {

	@Override
	protected List<Predicate> getWhereClause(GymDTO dto, CriteriaBuilder builder, Root<GymDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<>();

		if (dto.getId() != null && dto.getId() > 0) {
			whereCondition.add(builder.equal(qRoot.get("id"), dto.getId()));
		}

		if (dto.getFristName() != null && !dto.getFristName().isEmpty()) {
			whereCondition.add(builder.like(qRoot.get("fristName"), dto.getFristName() + "%"));
		}

		if (dto.getLastName() != null && !dto.getLastName().isEmpty()) {
			whereCondition.add(builder.like(qRoot.get("lastName"), dto.getLastName() + "%"));
		}

		if (dto.getDob() != null) {
			whereCondition.add(builder.equal(qRoot.get("DOB"), dto.getDob()));
		}
		if (dto.getGender() != null && !dto.getGender().isEmpty()) {
			whereCondition.add(builder.like(qRoot.get("gender"), dto.getGender() + "%"));
		}

		return whereCondition;
	}

	@Override
	public Class<GymDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return GymDTO.class;
	}

}
