package eat;

	public class Main {
	    public static void main(String[] args) {
	        Food food = new Food();
	        EatAnnotationProcessor.process(food);
	    }
}
