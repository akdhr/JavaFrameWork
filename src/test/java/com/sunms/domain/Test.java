package com.sunms.domain;

import java.io.IOException;
import java.io.Reader;

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
//			sqlSession.getMapper(arg0)
			System.out.println(user);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
