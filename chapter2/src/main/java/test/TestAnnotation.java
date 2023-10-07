package test;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import annotation.AnnotationUser;

public class TestAnnotation {
	public static void main(String[] argStrings) {
		ClassPathXmlApplicationContext appCon = new ClassPathXmlApplicationContext("annotationContext.xml");
		AnnotationUser au = (AnnotationUser)appCon.getBean("annotationUser");
		System.out.println(au.getUname());
	}
}
