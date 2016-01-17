package com.sunms.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sunms.dao.userDao.UserDao;
import com.sunms.domain.User;
import com.sunms.service.accountService.AccountService;
import com.sunms.service.userService.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Test {

	@Autowired
	private UserService userService;

	@Autowired
	private UserDao userDao;

	@Autowired
	private AccountService accountService;

/*	@org.junit.Test
	public void test() {
		User user = userService.getUser(1);
		System.out.println(user);
		System.out.println("what the fuck");
	}

	@org.junit.Test
	public void TestSqlSession() {
		User user = userDao.getUser(1);
		System.out.println(user);
	}*/

	@org.junit.Test
	public void testTransfer() {
		accountService.transfer("xiaoshuai", "sunms", 200d);
	}
}
