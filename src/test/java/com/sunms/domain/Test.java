package com.sunms.domain;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

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
			// not work
			/*
			 * String statement = "com.sunms.mappers.user.addper2"; Map<String,
			 * Integer> param = new HashMap<String, Integer>();
			 * param.put("add1", 5); param.put("add2", 6);
			 * sqlSession.selectOne(statement, param);
			 * System.out.println(param.get("thesum"));
			 */

			// work
			/*
			 * String statement = "com.sunms.mappers.user.addper"; Map<String,
			 * Integer> param = new HashMap<String, Integer>();
			 * param.put("add1", 2); param.put("add2", 7);
			 * sqlSession.selectOne(statement, param);
			 * System.out.println(param.get("thesums"));
			 */

			String statement = "com.sunms.mappers.user.getNames";
			Map<String, Object> param = new HashMap<String, Object>();
			param.put("age", 23);
			sqlSession.selectOne(statement, param);
			System.out.println(param.get("name"));

			/*
			 * Map<String, Object> param2 = new HashMap<String, Object>();
			 * param2.put("age", 23); String statement =
			 * "com.sunms.mappers.user.getNames";
			 * sqlSession.selectOne(statement, param2);
			 * System.out.println(param2.get("name"));
			 */

			/*
			 * Map<String, Integer> param = new HashMap<String, Integer>();
			 * param.put("add1", 4); param.put("add2", 7);
			 * sqlSession.selectOne(statement, param);
			 * System.out.println(param.get("thesum"));
			 */

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
