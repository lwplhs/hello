package com.lhs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhs.dao.SurnameDao;
import com.lhs.entity.PageBean;
import com.lhs.entity.Surname;
import com.lhs.service.impl.SurnameServiceImpl;

@Service
public class SurnameService implements SurnameServiceImpl{

	@Autowired
	private SurnameDao surnameDao;
	
	@Override
	public List<Surname> findAll() {
		
		return surnameDao.findAll();
	}

	@Override
	public PageBean<Surname> findAllSurnameWithPage(int pageNum,int pageSize) {
		List<Surname> list=surnameDao.findAll();
		int totalRecord=list.size();
		PageBean pb=new PageBean(pageNum, pageSize, totalRecord);
		int startIndex=pb.getStartIndex();
		
		pb.setList(surnameDao.findAllWithIndex(startIndex, pageSize));
		return pb;
	}

}
