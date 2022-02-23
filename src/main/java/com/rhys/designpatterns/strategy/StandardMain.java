package com.rhys.designpatterns.strategy;

import java.util.Arrays;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/10 9:37 下午
 */
public class StandardMain {
    public static void main(String[] args) {
        Cat[] cat1 = {new Cat(6, 3), new Cat(4, 1), new Cat(9, 5)};
        Cat[] cat2 = {new Cat(6, 3), new Cat(4, 1), new Cat(9, 5)};
        Dog[] dog = {new Dog(3), new Dog(1), new Dog(5)};

        Sorter<Cat> catSorter = new Sorter<>();
        Sorter<Dog> dogSorter = new Sorter<>();

        // 策略一：按猫的体重排序
        catSorter.sort(cat1, new CatWeightComparator());

        // 策略二：按猫的身长排序
        catSorter.sort(cat2, new CatHeightComparator());

        // 策略三：按狗的饭量排序
        dogSorter.sort(dog, new DogComparator());

        System.out.println("策略一：按猫的体重由小到大排序"+Arrays.toString(cat1));
        System.out.println("策略二：按猫的身长由大到小排序"+Arrays.toString(cat2));
        System.out.println("策略三：按狗的饭量由小到大排序"+Arrays.toString(dog));
    }
}
