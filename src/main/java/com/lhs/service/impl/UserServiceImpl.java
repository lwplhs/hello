package com.lhs.service.impl;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.lhs.entity.User;

public interface UserServiceImpl {
	List<User> findAll();
	PageInfo<User> selectAll(Integer pageNum, Integer pageSize);
	void creatUser();
}
