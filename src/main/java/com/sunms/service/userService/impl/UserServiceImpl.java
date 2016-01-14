package com.sunms.service.userService.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunms.dao.userDao.UserDao;
import com.sunms.domain.User;
import com.sunms.service.userService.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;// 由org.mybatis.spring.mapper.MapperScannerConfigurer自动注册

	public User getUser(Integer id) {
		// TODO Auto-generated method stub
		return userDao.getUser(id);
	}

}
