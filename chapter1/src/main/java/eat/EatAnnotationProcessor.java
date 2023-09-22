package eat;

import java.lang.reflect.Method;

public class EatAnnotationProcessor {
	public static void process(Object obj) {
        Class<?> clazz = obj.getClass();

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Eat.class)) {
                Eat annotation = method.getAnnotation(Eat.class);
                String value = annotation.value();
                System.out.println("Eating: " + value);
                try {
                    method.invoke(obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
