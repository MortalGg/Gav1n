package test;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import apple.configuration.JavaAppleConfigration;
import apple.controller.AppleController;

public class TestApple1 {

	public static void main(String[] args) {
		 //用纯java方法
		 AnnotationConfigApplicationContext appCon = new AnnotationConfigApplicationContext(JavaAppleConfigration.class);
		 AppleController ac = appCon.getBean(AppleController.class);
		 ac.printApple();
		 appCon.close();

	}

}
