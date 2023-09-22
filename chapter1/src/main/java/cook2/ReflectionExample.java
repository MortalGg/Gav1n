package cook2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        // 通过反射创建对象
        Class<?> cls = Recipe.class;
        Constructor<?> constructor = cls.getConstructor();
        Recipe recipe = (Recipe) constructor.newInstance();

        // 使用 setter 方法注入属性值
        Method setNameMethod = cls.getDeclaredMethod("setName", String.class);
        setNameMethod.invoke(recipe, "Pasta Carbonara");

        Method setIngredientsMethod = cls.getDeclaredMethod("setIngredients", String[].class);
        setIngredientsMethod.invoke(recipe, new Object[]{new String[]{"Pasta", "Eggs", "Bacon"}});

        // 使用 getter 方法获取属性值
        Method getNameMethod = cls.getDeclaredMethod("getName");
        String retrievedName = (String) getNameMethod.invoke(recipe);
        System.out.println("Recipe Name: " + retrievedName);

        Method getIngredientsMethod = cls.getDeclaredMethod("getIngredients");
        String[] retrievedIngredients = (String[]) getIngredientsMethod.invoke(recipe);
        System.out.println("Ingredients: ");
        for (String ingredient : retrievedIngredients) {
            System.out.println("- " + ingredient);
        }

        // 调用方法
        Method prepareMethod = cls.getDeclaredMethod("prepare");
        prepareMethod.invoke(recipe);

        Method cookMethod = cls.getDeclaredMethod("cook");
        cookMethod.setAccessible(true);
        cookMethod.invoke(recipe);
    }
}
