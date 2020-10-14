package modelStudy.strategyModel;

public class Cat {
    int food;
    int height;

    public Cat(int food, int height) {
        this.food = food;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "food=" + food +
                ", height=" + height +
                '}';
    }
}
