package com.rhys.designpatterns.strategy;

import java.util.Arrays;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/10 9:37 下午
 */
public class LambdaMain {
    public static void main(String[] args) {
        Cat[] cat1 = {new Cat(6, 3), new Cat(4, 1), new Cat(9, 5)};
        Cat[] cat2 = {new Cat(3, 5), new Cat(1, 2), new Cat(5, 7)};
        Dog[] dog = {new Dog(3), new Dog(1), new Dog(5)};

        Sorter<Cat> catSorter = new Sorter<>();
        Sorter<Dog> dogSorter = new Sorter<>();

        // 策略一：按猫的体重排序
        catSorter.sort(cat1, (o1, o2) -> {
            if (o1.weight < o2.weight) {
                return -1;
            } else if (o1.weight > o2.weight) {
                return 1;
            } else {
                return 0;
            }
        });

        // 策略二：按猫的身长排序
        catSorter.sort(cat2, (o1, o2) -> {
            if (o1.height > o2.height) {
                return -1;
            } else if (o1.height < o2.height) {
                return 1;
            } else {
                return 0;
            }
        });

        // 策略三：按狗的饭量排序
        dogSorter.sort(dog, (o1, o2) -> {
            if (o1.food < o2.food) {
                return -1;
            } else if (o1.food > o2.food) {
                return 1;
            } else {
                return 0;
            }
        });

        System.out.println("策略一：按猫的体重由小到大排序"+Arrays.toString(cat1));
        System.out.println("策略二：按猫的身长由大到小排序"+Arrays.toString(cat2));
        System.out.println("策略三：按狗的饭量由小到大排序"+Arrays.toString(dog));
    }
}
