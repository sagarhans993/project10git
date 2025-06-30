package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.GymDAOInt;
import com.rays.dto.GymDTO;

@Service
@Transactional
public class GymServiceImpl extends BaseServiceImpl<GymDTO, GymDAOInt> implements GymServiceInt{

}
