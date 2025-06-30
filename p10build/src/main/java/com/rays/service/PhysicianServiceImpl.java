package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.PhysicianDAOInt;
import com.rays.dto.PhysicianDTO;

@Service
@Transactional
public class PhysicianServiceImpl extends BaseServiceImpl<PhysicianDTO, PhysicianDAOInt> implements PhysicianServiceInt{

}
