package cook3;

public class Chef {
    private Recipe recipe;

    public Chef(Recipe recipe) {
        this.recipe = recipe;
    }

    public void cook() {
        String recipeName = recipe.getName();
        System.out.println("Chef is cooking " + recipeName);
        // 具体的烹饪逻辑
    }
}

