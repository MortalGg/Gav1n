package eat;

public class Food {
    @Eat("Apple")
    public void eatApple() {
        System.out.println("Eating an apple");
    }

    @Eat("Banana")
    public void eatBanana() {
        System.out.println("Eating a banana");
    }

    public void doSomething() {
        System.out.println("Doing something else");
    }
}