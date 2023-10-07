package annotation1_4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import annotation1_4.controller.TestController;
import annotation1_4.dao.TestDao;
import annotation1_4.service.TestService;

@Configuration
public class JavaConfig {
	
	@Bean
	public TestDao getTestDao() {
		return new TestDao();
	}
	
	@Bean
	public TestService getTestService() {
		TestService ts = new TestService();
		ts.setTestDao(getTestDao());
		return ts;
	}
	
	@Bean
	public TestController getTestController() {
		TestController tc = new TestController();
		tc.setTestService(getTestService());
		return tc;
	}
	
}
