package com.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class TestMybatis {
	public static void main(String[] args) throws IOException {
		String resource = "mybatis.xml";
		// 读取配置文件
		Reader reader = Resources.getResourceAsReader(resource);
		// 获取会话工厂
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession openSession = sqlSessionFactory.openSession();
		// 查询
		String sql = "com.mapper.UserMapper.deleteUser";
		// 调用api查询
		Map map=new HashMap();
		map.put("name","傻强");
		map.put("age","13");
		System.out.println( "結果 ："+openSession.delete(sql, map));
		openSession.commit();
		//String sql = "com.mapper.UserMapper.getName";

		//System.out.println( "結果 ："+openSession.selectOne(sql, "李四"));

	}
}
