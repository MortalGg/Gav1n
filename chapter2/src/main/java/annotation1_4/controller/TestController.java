package annotation1_4.controller;

import annotation1_4.service.TestService;

public class TestController {
	
	TestService testService;

	public void setTestService(TestService testService) {
		this.testService = testService;
	}
	public void save() {
		testService.save();
		
	}
}
