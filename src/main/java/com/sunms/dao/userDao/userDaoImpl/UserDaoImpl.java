package com.sunms.dao.userDao.userDaoImpl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sunms.dao.userDao.UserDao;
import com.sunms.domain.User;

@Repository("userDaoImpl")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	public User getUser(Integer id) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne("com.sunms.mappers.user.User.getUser", 1);
	}

	public void insertUser(User user) {
		// TODO Auto-generated method stub

	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	public void update(User user) {
		// TODO Auto-generated method stub

	}

	public List<User> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
