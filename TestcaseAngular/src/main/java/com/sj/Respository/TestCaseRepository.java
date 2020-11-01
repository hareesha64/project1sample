package com.sj.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sj.Model.TestCase;


public interface TestCaseRepository extends JpaRepository<TestCase, Integer> {
	
	
	public TestCase findById(TestCase testCase);
	public List<TestCase> findAll();
	public TestCase save(TestCase testcase);
	public void deleteById(int id);
	//public TestCase updateTestCase(TestCase testcase);

}
