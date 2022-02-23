package com.rhys.designpatterns.strategy;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/10 11:06 下午
 */
public class CatHeightComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.height > o2.height) {
            return -1;
        } else if (o1.height < o2.height) {
            return 1;
        } else {
            return 0;
        }
    }
}
