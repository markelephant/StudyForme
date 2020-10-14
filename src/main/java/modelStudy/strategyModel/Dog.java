package modelStudy.strategyModel;

public class Dog {
    int food;
    int height;

    public Dog(int food, int height) {
        this.food = food;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                ", height=" + height +
                '}';
    }
}
