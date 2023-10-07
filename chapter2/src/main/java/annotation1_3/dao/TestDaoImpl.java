package annotation1_3.dao;

import org.springframework.stereotype.Repository;

@Repository("testDao")
public class TestDaoImpl implements TestDao{
	
	@Override
	public void save() {
		
		System.out.println("testDao save");
	}
}
