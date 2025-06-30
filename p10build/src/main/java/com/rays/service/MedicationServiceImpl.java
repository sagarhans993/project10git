package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.MedicationDAOInt;
import com.rays.dto.MedicationDTO;

@Service
@Transactional
public class MedicationServiceImpl  extends BaseServiceImpl<MedicationDTO, MedicationDAOInt> implements MedicationServiceInt{

}
