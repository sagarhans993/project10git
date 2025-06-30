package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.FollowDTO;
import com.rays.form.FollowForm;
import com.rays.service.FollowServiceInt;

@RestController
@RequestMapping(value = "Follow")
public class FollowCtl extends BaseCtl<FollowForm, FollowDTO, FollowServiceInt>{

}
