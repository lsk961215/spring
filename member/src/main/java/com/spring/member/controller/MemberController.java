package com.spring.member.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.member.dao.MemberDAO;
import com.spring.member.vo.MemberVO;

@Controller
public class MemberController {
	
	@RequestMapping("/")
	public String goMain() {
		return "main";
	}
	
	@RequestMapping("/mem.do")
	public void getMember() {
		MemberDAO dao = new MemberDAO();
		List<MemberVO> memberList = dao.selectAllMemberList();
		
		for(int i = 0; i<memberList.size(); i++) {
			MemberVO vo = memberList.get(i);
			
			System.out.println("id : " + vo.getId() + ", name : " + vo.getName());
		}
	}
}
