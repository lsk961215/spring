package com.spring.db.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
	@Autowired
	private SqlSession sqlSession;

	public Map<String, Object> getUserInfo(int userSeq) {
		// userMapper ��� �κа� 5�ܰ迡 �ִ� mapper.xml ������ namespace�� �����ϰ� �����ش�
        //.getUserInfo �� 5�ܰ迡 �ִ� <select id= �κи� �����ϰ� �����ش�.
        return sqlSession.selectOne("userMapper.getUserInfo",userSeq);
        
	}
}
