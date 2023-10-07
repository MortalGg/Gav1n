package annotation1_3.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import annotation1_3.dao.TestDao;

@Service("testService")
public class TestServiceImpl implements TestService {
	
	@Resource(name = "testDao")
	private TestDao testDao;
	@Override
	public void save() {
		
		testDao.save();
		System.out.println("testService save");
		
	}
	
}
