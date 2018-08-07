package com.mis.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mis.domain.CustomerVO;
import com.mis.persistence.CustomerDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class CustomerDAOTest {
	
	@Inject
	private CustomerDAO dao;
	
	@Test
	public void testInsertCustomer() throws Exception {
		CustomerVO vo = new CustomerVO();
		
		vo.setUserid("C001");
		vo.setName("박길수");
		vo.setBirthyear(1993);
		vo.setAddress("대전광역시 서구 청사로 281");
		vo.setPhone("01041794003");
		vo.setGrade("SILVER");
		
		dao.insertCustomer(vo);
	}
	
	@Test
	public void testSelectCustomer() throws Exception {
		System.out.println(dao.readCustomer("C001"));
	}
	
	@Test
	public void testUpdateCustomer() throws Exception {
		CustomerVO vo = new CustomerVO();
		vo.setUserid("C002");
		vo.setName("길수");
		vo.setBirthyear(1994);
		vo.setAddress("대전광역시 서구 청사로 281 204동");
		vo.setGrade("GOLD");
		dao.updateCustomer(vo);
	}
	
	@Test
	public void testDeleteCustomer() throws Exception {
		dao.deleteCustomer("C001");
	}
}
