package com.lhs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lhs.dao.UserDao;
import com.lhs.entity.User;
import com.lhs.service.impl.UserServiceImpl;

@Service
public class UserService implements UserServiceImpl{

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Override
	public PageInfo<User> selectAll(Integer pageNum, Integer PageSize) {
		//开启分页查询，写在查询语句上方
	    //每页的数量 pageSize;
	    //当前页的数量  size;
	    PageHelper.startPage(pageNum, PageSize);
	    List<User> userInfoList = userDao.selectAll();
	    PageInfo<User> pageInfo = new PageInfo<User>(userInfoList);
	    return pageInfo;
	}

	@Override
	public void creatUser() {
		// TODO Auto-generated method stub
		userDao.creatUser();
	}

}
