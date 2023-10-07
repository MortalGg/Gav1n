package apple.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Repository;

import apple.domain.Apple;

@Repository("appleDaoImpl")
public class AppleDaoImpl {
	
	Random numList = new Random();
	
	public Apple generateApple() {
		
		float price = numList.nextFloat()*7+3;
		float weight = numList.nextFloat()*200+100;
		String[] areas = {"烟台", "延安","天水","洛川","灵宝"};
		String area = areas[numList.nextInt(areas.length)];
		return new Apple(price, weight, area);
		
	}
	
	public List<Apple> getApples(){
		List<Apple> Apples = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			Apples.add(generateApple());
		}
		return Apples;
	}
}
