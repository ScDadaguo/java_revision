/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

/**
 * @FileName: QuickSort.java
 * @Description: 快速排序的基本思想：
                通过一趟排序将想要排序的数据分割成独立的两部分，
                其中一部分的所有数据都比另一部分的所有数据都要小，
                然后再按此方法对这两部分数据分别进行快速排序
                整个排序过程可以递归进行，以此达到整个数据变成有序输列。
 * @Author: guohao
 * @Date: 2019/8/7 15:02
 */
public class QuickSort {
    private static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= pivot) {
                high--;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] <= pivot) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = pivot;
        return low;
    }

    private static void qsort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivot = partition(arr, low, high);
        qsort(arr, low, pivot - 1);
        qsort(arr, pivot + 1, high);
    }
    public static void sort(int[] arr){
        qsort(arr,0,arr.length-1);
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 2};
        sort(a);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}




