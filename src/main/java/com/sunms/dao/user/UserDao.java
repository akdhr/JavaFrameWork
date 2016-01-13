package com.sunms.dao.user;

import java.util.List;

import com.sunms.domain.User;

public interface UserDao {

	User getUser(Integer id);

	void insertUser(User user);

	void delete(Integer id);

	void update(User user);

	List<User> selectAll();
}
