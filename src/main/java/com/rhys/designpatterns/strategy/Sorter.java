package com.rhys.designpatterns.strategy;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/10 9:39 下午
 */
public class Sorter<T> {
    public void sort(T[] arr, Comparator<T> comparator) {
        //边界控制
        if (arr != null && arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = comparator.compare(arr[j], arr[minIndex]) == 1 ? minIndex : j;
            }
            swap(arr, i, minIndex);
        }
    }


    /**
     * 替换数值
     *
     * @param arr 原数组
     * @param i   被替换元素
     * @param j   替换元素
     */
    public void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
