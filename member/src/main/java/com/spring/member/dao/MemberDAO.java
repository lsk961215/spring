package com.spring.member.dao;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.spring.member.vo.MemberVO;

public class MemberDAO {
	private static SqlSessionFactory sqlMapper = null;
	
	public static SqlSessionFactory getInstance() {
		if(sqlMapper == null) {
			try {
				String res = "SqlMapConfig.xml";
				Reader reader = Resources.getResourceAsReader(res);
				sqlMapper = new SqlSessionFactoryBuilder().build(reader);
				reader.close();
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		
		return sqlMapper;
	}
	
	public List<MemberVO> selectAllMemberList() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		
		List<MemberVO> memlist = session.selectList("mapper.member.selectAllMemberList");
		
		return memlist;
	}
}
