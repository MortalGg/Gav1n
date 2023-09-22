package cook;

class Recipe {
    private String name;
    private String[] ingredients;
    
    public Recipe(String name, String[] ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }
    
    public void prepare() {
        System.out.println("Preparing recipe: " + name);
        System.out.println("Ingredients:");
        for (String ingredient : ingredients) {
            System.out.println("- " + ingredient);
        }
        System.out.println("Recipe prepared!");
    }
    
    private void cook() {
        System.out.println("Cooking recipe: " + name);
        System.out.println("Cooking method goes here.");
        System.out.println("Recipe cooked!");
    }
    
    public String getName() {
        return name;
    }
    
    public String[] getIngredients() {
        return ingredients;
    }
}