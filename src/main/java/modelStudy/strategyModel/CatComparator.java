package modelStudy.strategyModel;

public class CatComparator implements MyComparator<Cat>{
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.food > o2.food) return 1;
        else if (o1.food < o2.food) return -1;
        else return 0;
    }
}
