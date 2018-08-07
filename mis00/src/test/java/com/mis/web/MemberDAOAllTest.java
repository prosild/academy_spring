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
public class MemberDAOAllTest {
	
	@Inject
	private MemberDAO dao;

	@Test
	public void testUpdateMember() throws Exception {
		MemberVO vo = new MemberVO();
		vo.setUserid("U001");
		vo.setUserpw("0000");
		vo.setUsername("박길수");
		vo.setEmail("admin@daum.net");
		dao.updateMember(vo);
	}
	
	@Test
	public void testSelectMember() throws Exception {
		System.out.println(dao.readWithPW("U001", "0000"));
	}
	
	@Test
	public void testDeleteMember() throws Exception {
		dao.deleteMember("U002", "0000");
	}
}
