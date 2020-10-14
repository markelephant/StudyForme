package modelStudy.strategyModel;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int [] a = {9,5,3,4,9,5,6,1,5};
        Goat [] a = {new Goat(6,6),new Goat(1,1),new Goat(5,5),new Goat(2,2)};
        Sorter<Goat> sorter = new Sorter<>();

        sorter.sort(a,(o1,o2)->{
            if(o1.food>o2.food) return 1;
            else if(o1.food<o2.food) return -1;
            else return 0;
        });
        System.out.println(Arrays.toString(a));
    }
}
