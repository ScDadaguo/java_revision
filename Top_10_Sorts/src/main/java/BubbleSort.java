/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

/**
 * @FileName: BubbleSort.java
 * @Description: BubbleSort.java类说明
 * @Author: guohao
 * @Date: 2019/8/19 13:24
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int temp = 0;
        boolean swap = true;
        for (int i = arr.length - 1; i > 0; i--) {
            swap = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (swap == false) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 2};
        bubbleSort(a);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}
