package com.mis.persistence;

import com.mis.domain.CustomerVO;

public interface CustomerDAO {

	public void insertCustomer(CustomerVO vo);
	
	public CustomerVO readCustomer(String userid) throws Exception;
	
	public void updateCustomer(CustomerVO vo) throws Exception;
	
	public void deleteCustomer(String useid) throws Exception;
	
}
