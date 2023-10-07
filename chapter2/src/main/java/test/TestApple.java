package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import apple.configuration.JavaAppleConfigration;
import apple.controller.AppleController;

public class TestApple {
	public static void main(String[] args) {
		ApplicationContext appCon = new ClassPathXmlApplicationContext("AppleAnnotationConfig.xml");
		AppleController ac = (AppleController)appCon.getBean("appleController");
		ac.printApple();
		}
}
