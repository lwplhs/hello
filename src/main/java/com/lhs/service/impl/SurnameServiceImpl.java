package com.lhs.service.impl;

import java.util.List;

import com.lhs.entity.PageBean;
import com.lhs.entity.Surname;


public interface SurnameServiceImpl {
	List<Surname> findAll();
	PageBean<Surname> findAllSurnameWithPage(int pageNum,int pageSize);
}
