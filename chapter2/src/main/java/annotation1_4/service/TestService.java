package annotation1_4.service;

import annotation1_4.dao.TestDao;

public class TestService {
	TestDao testDao;

	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}
	public void save() {
		testDao.save();
	}
}
