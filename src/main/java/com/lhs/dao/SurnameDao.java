package com.lhs.dao;

import java.util.List;

import com.lhs.entity.Surname;


public interface SurnameDao {
	List<Surname> findAll();
	List<Surname> findAllWithIndex(int startIndex,int pageSize);
}
