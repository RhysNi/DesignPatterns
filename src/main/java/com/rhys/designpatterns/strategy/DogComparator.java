package com.rhys.designpatterns.strategy;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/10 11:06 下午
 */
public class DogComparator implements Comparator<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.food < o2.food) {
            return -1;
        } else if (o1.food > o2.food) {
            return 1;
        } else {
            return 0;
        }
    }
}
