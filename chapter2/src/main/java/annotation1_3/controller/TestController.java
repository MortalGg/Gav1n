package annotation1_3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import annotation1_3.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	
	public void save() {
		testService.save();
		System.out.println("testController save");
	}
	
}

