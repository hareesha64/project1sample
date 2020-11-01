package com.sj.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sj.Model.TestCase;
import com.sj.Respository.TestCaseRepository;


@Service
public class TestCaseService {
	@Autowired
	TestCaseRepository dao;

	public TestCase testCaseById(int id)
	{
		Optional<TestCase> t=dao.findById(id);
		return t.get();
	}
	public List<TestCase> getAllTestCases()
	{
		return dao.findAll();
	}
	public TestCase createTestCase(TestCase testCase)
	{
		return dao.save(testCase);
	}
	/**public TestCase updateTestcase(TestCase testcase)
	{
		Optional<TestCase> toupdate=dao.findById(testcase.getId());
		
		TestCase t=toupdate.get();
		t.setRunTime(testcase.getRunTime());
		return dao.save(t);
	}**/
	public void deleteTestCase(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}
	 
}
