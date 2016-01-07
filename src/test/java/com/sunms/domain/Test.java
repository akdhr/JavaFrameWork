package com.sunms.domain;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test {

	public static void main(String[] args) {
		String resource = "conf.xml";
		try {
			Reader reader = Resources.getResourceAsReader(resource);
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
			SqlSession sqlSession = factory.openSession();
			String statement = "com.sunms.mappers.user.insertUser";
			User user = new User("warboy", 25);
			sqlSession.insert(statement, user);
			statement = "com.sunms.mappers.user.selectAll";
			List<User> list = sqlSession.selectList(statement);
			System.out.println(list);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
