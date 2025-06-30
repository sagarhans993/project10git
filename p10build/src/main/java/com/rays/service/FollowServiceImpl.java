package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.FollowDAOInt;
import com.rays.dto.FollowDTO;

@Service
@Transactional
public class FollowServiceImpl extends BaseServiceImpl<FollowDTO, FollowDAOInt> implements FollowServiceInt{
	

}
