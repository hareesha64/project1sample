package com.sj.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sj.Model.TestCase;
import com.sj.Service.TestCaseService;
@RestController
@RequestMapping(value="/api")
public class TestCaseController {
		@Autowired
			TestCaseService service;
			@GetMapping("/hi")
			public String sayhello()
			{
				return ("Hello");
			}
			
			@GetMapping("/get")
			public List<TestCase> getTestCase()
			{
			
				return service.getAllTestCases();
			}
			@GetMapping("/testCase/{id}")
			public TestCase getTestCaseById(@PathVariable int id) {
				return service.testCaseById(id);
				
			}
			@PutMapping("/insert")
			public TestCase insertTestCase(@RequestBody TestCase t)
			{
				return service.createTestCase(t);
			}
			/*@PutMapping("/update/")
			public TestCase UpdateTestCase(@RequestBody TestCase t)
			{
				return service.updateTestcase(t);
			}*/
			@DeleteMapping("/delete/{id}")
			public List<TestCase> deleteTestCase(@PathVariable int id)
			{
				service.deleteTestCase(id);
				return service.getAllTestCases();
			}
			//@PostMapping(value="/testCase")
			/**public TestCase editTestCase(@RequestBody TestCase testcase)
			{	return service.updateTestcase(testcase);
				
			}**/
		}






