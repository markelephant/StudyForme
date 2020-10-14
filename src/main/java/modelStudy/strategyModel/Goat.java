package modelStudy.strategyModel;

public class Goat {
    int food;
    int height;

    public Goat(int food, int height) {
        this.food = food;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Goat{" +
                "food=" + food +
                ", height=" + height +
                '}';
    }
}
