package com.wipro.fstpg.pojo;

import java.io.Serializable;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

import com.ibatis.sqlmap.client.SqlMapClient;

public class Student implements Serializable {

	private static final long serialVersionUID = -3275378188512857880L;

	private Long stuId;
	private String stuName;
	private String stuGender;
	private Long stuAge;
	private int mark1;
	private int mark2;
	private int mark3;
		
	public Long getStuId() {
		return stuId;
	}

	public void setStuId(Long stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuGender() {
		return stuGender;
	}

	public void setStuGender(String stuGender) {
		this.stuGender = stuGender;
	}

	public Long getStuAge() {
		return stuAge;
	}

	public void setStuAge(Long stuAge) {
		this.stuAge = stuAge;
	}

	public int getMark1() {
		return mark1;
	}

	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}

	public int getMark2() {
		return mark2;
	}

	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}

	public int getMark3() {
		return mark3;
	}

	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}

	
}
