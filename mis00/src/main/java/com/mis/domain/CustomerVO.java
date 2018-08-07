package com.mis.domain;

import java.util.Date;

public class CustomerVO {
	
	private String userid;
	private String name;
	private int birthyear;
	private String address;
	private String phone;
	private String grade;
	private Date regdate;
	private Date moddate;
	
	public CustomerVO() {
		super();
	}

	public CustomerVO(String userid, String name) {
		this.userid = userid;
		this.name = name;
	}
	
	public CustomerVO(String userid, String name, int birthyear) {
		this(userid, name);
		this.birthyear = birthyear;
	}
	
	public CustomerVO(String userid, String name, int birthyear, String address) {
		this(userid, name, birthyear);
		this.address = address;
	}

	public CustomerVO(String userid, String name, int birthyear, String address, String phone) {
		this(userid, name, birthyear, address);
		this.phone = phone;
	}

	public CustomerVO(String userid, String name, int birthyear, String address, String phone, String grade) {
		this(userid, name, birthyear, address, phone);
		this.grade = grade;
	}

	public CustomerVO(String userid, String name, int birthyear, String address, String phone, String grade, Date regdate) {
		this(userid, name, birthyear, address, phone, grade);
		this.regdate = regdate;
	}
	
	public CustomerVO(String userid, String name, int birthyear, String address, String phone, String grade, Date regdate, Date moddate) {
		super();
		this.userid = userid;
		this.name = name;
		this.birthyear = birthyear;
		this.address = address;
		this.phone = phone;
		this.grade = grade;
		this.regdate = regdate;
		this.moddate = moddate;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthyear() {
		return birthyear;
	}

	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public Date getModdate() {
		return moddate;
	}

	public void setModdate(Date moddate) {
		this.moddate = moddate;
	}

	@Override
	public String toString() {
		return "CustomerVO [userid=" + userid + ", name=" + name + ", birthyear=" + birthyear + ", address=" + address
				+ ", phone=" + phone + ", grade=" + grade + ", regdate=" + regdate + ", moddate=" + moddate + "]";
	}
	
	
}
