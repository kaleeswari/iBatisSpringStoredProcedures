package com.wipro.fstpg.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.wipro.fstpg.dao.StudentDao;
import com.wipro.fstpg.pojo.Student;



public class StudentDaoImpl extends SqlMapClientDaoSupport implements StudentDao {
    

	@Override
	public Student get(Long stuId) {
	
		return (Student) getSqlMapClientTemplate().queryForObject("getById", stuId);
	}

	@Override
	public List<Student> getAll() {
		@SuppressWarnings("unchecked")
		List<Student> students = getSqlMapClientTemplate().queryForList("getAll");
		return students;
	}

	// Perform Insert Operation 
	@Override
	public void insert(Student student) {
		getSqlMapClientTemplate().insert("insert", student);
	}

	// Perform update Operation 
	@Override
	public void update(Long stuId) {
		getSqlMapClientTemplate().update("update", stuId);
	}

	// Perform delete Operation 
	@Override
	public void delete(Long stuId) {
		getSqlMapClientTemplate().delete("delete",stuId);
	}

	// Retrieve details from stored procedure
	@Override
	public List<Student> getStoredProcedure() {
		@SuppressWarnings("unchecked")
		List<Student> students = getSqlMapClientTemplate().queryForList("getStudentInfo");
		return students;
	}

	
    @Override
	public Student getStoredProcedureById(Long stuId) {
		
		return (Student) getSqlMapClientTemplate().queryForObject("getStudentInfoById", stuId);
    }

	
	
}
