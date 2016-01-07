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
			String statement = "com.sunms.mappers.user.getUser";
			User user = sqlSession.selectOne(statement, 1);
			// sqlSession.getMapper(arg0)
			System.out.println(user);
			System.out.println("---------------");
			/*statement = "com.sunms.mappers.user.insertUser";
			User user2 = new User();
			user2.setName("warboy");
			user2.setAge(26);
			sqlSession.insert(statement, user2);
			System.out.println("---------------");
			statement = "com.sunms.mappers.user.insertUser";
			User user3 = new User();
			user3.setName("sjtu");
			user3.setAge(27);
			sqlSession.insert(statement, user3);
			System.out.println("---------------");*/
			statement = "com.sunms.mappers.user.selectAll";
			List<User> list = sqlSession.selectList(statement);
			System.out.println(list);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
