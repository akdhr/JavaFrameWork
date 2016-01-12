package com.sunms.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sunms.domain.User;
import com.sunms.service.user.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class Test {

	@Autowired
	private UserService userService;

	@org.junit.Test
	public void test() {
		User user = userService.getUser(1);
		System.out.println(user);
		System.out.println("what the fuck");
	}
}
