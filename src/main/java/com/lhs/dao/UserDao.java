package com.lhs.dao;

import java.util.List;

import com.lhs.entity.User;

public interface UserDao {

	
	List<User> selectAll();
	List<User> findAll();
	void creatUser();
}
