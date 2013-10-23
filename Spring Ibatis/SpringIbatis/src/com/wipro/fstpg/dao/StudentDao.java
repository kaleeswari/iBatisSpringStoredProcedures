package com.wipro.fstpg.dao;

import java.util.List;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.wipro.fstpg.pojo.*;


public interface StudentDao {

	
	public Student get(Long stuId);

	public List<Student> getAll();

	public void insert(Student student);

	public void update(Long stuId);

	public void delete(Long stuId);
	
	public List<Student> getStoredProcedure();
	
	public Student getStoredProcedureById(Long stuId);

}
