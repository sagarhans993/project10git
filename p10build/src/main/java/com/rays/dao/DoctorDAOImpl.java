package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.DoctorDTO;

@Repository

public class DoctorDAOImpl extends BaseDAOImpl<DoctorDTO> implements DoctorDAOInt{

    @Override
    protected List<Predicate> getWhereClause(DoctorDTO dto, CriteriaBuilder builder, Root<DoctorDTO> qRoot) {

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
 
        if (dto.getSpecialization() != null && !dto.getSpecialization().isEmpty()) {
            whereCondition.add(builder.like(qRoot.get("specialization"), dto.getSpecialization() + "%"));
        }
        

        if (dto.getPhone() != null && !dto.getPhone().isEmpty()) {
            whereCondition.add(builder.like(qRoot.get("phone"), dto.getPhone() + "%"));
        }
        
        return whereCondition;
    }

    @Override
    public Class<DoctorDTO> getDTOClass() {
        return DoctorDTO.class;
    }{

}

}
