/**
 * 
 */
package com.evan.context_service.db;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author 310199253
 *
 */
public class TestMyBatis {

	public static void main(String[] args) throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		// SqlSession session = sqlSessionFactory.openSession();
		// try {
		// Blog blog = session.selectOne(
		// "org.mybatis.example.BlogMapper.selectBlog", 101);
		// } finally {
		// session.close();
		// }

		SqlSession session = sqlSessionFactory.openSession();
		try {
			TestEntityMapper mapper = session.getMapper(TestEntityMapper.class);
			TestEntity testEntity = mapper.selectTestEntity(1);

			System.out.println(testEntity);

		} finally {
			session.close();
		}
	}
}
