/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

/**
 * @FileName: SelectionSort.java
 * @Description: 选择排序
 * @Author: guohao
 * @Date: 2019/8/7 9:41
 */
public class SelectionSort {

    public static void selectionSort(int[] arr){
        int min, temp = 0;
        for (int i = 0; i <arr.length-1 ; i++) {
             min = i;
            for (int j = 0; j <arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
                if (min != i) {
                    temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp;
                }
            }
        }
    }
}
