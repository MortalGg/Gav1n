package cook3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
        // 加载 XML 配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 获取 chef bean
        Chef chef = (Chef) context.getBean("chef");

        // 调用 cook 方法
        chef.cook();
    }
}
