package cook;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        // 通过反射创建对象
        Class<?> cls = Recipe.class;
        Constructor<?> constructor = cls.getConstructor(String.class, String[].class);
        Recipe recipe = (Recipe) constructor.newInstance("Pasta Carbonara", new String[]{"Pasta", "Eggs", "Bacon"});
        
        // 访问字段
        Field nameField = cls.getDeclaredField("name");
        nameField.setAccessible(true);
        String nameValue = (String) nameField.get(recipe);
        System.out.println("Recipe Name: " + nameValue);
        
        Field ingredientsField = cls.getDeclaredField("ingredients");
        ingredientsField.setAccessible(true);
        String[] ingredientsValue = (String[]) ingredientsField.get(recipe);
        System.out.println("Ingredients: ");
        for (String ingredient : ingredientsValue) {
            System.out.println("- " + ingredient);
        }
        
        // 调用方法
        Method prepareMethod = cls.getDeclaredMethod("prepare");
        prepareMethod.invoke(recipe);
        
        Method cookMethod = cls.getDeclaredMethod("cook");
        cookMethod.setAccessible(true);
        cookMethod.invoke(recipe);
        
        // 调用公共方法获取字段值
        Method getNameMethod = cls.getMethod("getName");
        String retrievedName = (String) getNameMethod.invoke(recipe);
        System.out.println("Retrieved Recipe Name: " + retrievedName);
        
        Method getIngredientsMethod = cls.getMethod("getIngredients");
        String[] retrievedIngredients = (String[]) getIngredientsMethod.invoke(recipe);
        System.out.println("Retrieved Ingredients: ");
        for (String ingredient : retrievedIngredients) {
            System.out.println("- " + ingredient);
        }
    }
}
