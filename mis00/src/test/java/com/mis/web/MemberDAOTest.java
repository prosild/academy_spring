package com.mis.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mis.domain.MemberVO;
import com.mis.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberDAOTest {
	
	@Inject
	private MemberDAO dao;
	
	@Test
	public void testTime() throws Exception {
		System.out.println(dao.getTime());
	}
	
//	@Test
//	public void testInsertMember() throws Exception {
//		MemberVO vo = new MemberVO();
//		vo.setUserid("U002");
//		vo.setUserpw("0000");
//		vo.setUsername("USER01");
//		vo.setEmail("user00@naver.com");
//		
//		dao.insertMember(vo);
//	}
	
	@Test
	public void testSelectPwMember() throws Exception {
		System.out.println(dao.readMember("U001"));
	}
	
	@Test
	public void testUpdateMember() throws Exception {
		MemberVO vo = new MemberVO();
		vo.setUserid("U001");
		vo.setUserpw("1111");
		vo.setUsername("박길수");
		vo.setEmail("admin@daum.net");
		dao.updateMember(vo);
	}
	
	@Test
	public void testSelectMember() throws Exception {
		System.out.println(dao.readWithPW("U001", "1111"));
	}
	
	@Test
	public void testDeleteMember() throws Exception {
		dao.deleteMember("U002", "0000");
	}
}
