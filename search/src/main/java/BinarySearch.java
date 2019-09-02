/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @FileName: 二分查找
 * @Description: 数组必须有序
 * @Author: guohao
 * @Date: 2019/8/20 14:47
 */
public class BinarySearch {

    public static int search(int[] arr, int findVal) {
        int left = 0;
        int right = arr.length - 1;
        while (left <=right) {
            int mid = (right + left) / 2;
            if (arr[mid] > findVal) {
                right = mid-1;
            } else if (arr[mid] < findVal) {
                left = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * 如果又相同数据的办法 /非递归
     * @param arr
     * @param findVal
     * @return
     */
    public static List Lsearch(int[] arr, int findVal) {
        List list;
        int left = 0;
        int right = arr.length - 1;
        while (left <=right) {
            int mid = (right + left) / 2;
            if (arr[mid] > findVal) {
                right = mid-1;
            } else if (arr[mid] < findVal) {
                left = mid+1;
            } else {
                 list = new ArrayList();
                int temp = mid - 1;
                while (true) {
                    if (temp < 0 ||arr[temp]!=findVal) {
                        break;
                    }
                    list.add(temp);
                    temp--;
                }
                temp = mid + 1;
                while (true) {
                    if (temp > arr.length-1 ||arr[temp]!=findVal) {
                        break;
                    }
                    list.add(temp);
                    temp++;
                }
                list.add(mid);
                return list;
            }
        }
        return null;
    }


    public static int searchRec(int[] arr, int finfVal,int left ,int right) {
        if (left > right) {
            return -1;
        }
        int mid = (right + left) / 2;
        if (arr[mid]>finfVal) {
            searchRec(arr, finfVal,left, mid - 1);
        } else if (arr[mid] < finfVal) {
            searchRec(arr, finfVal, mid + 1, right);
        } else {
            return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 8, 10, 89, 1000,1000 ,1234};
//        final int result = BinarySearch.search(arr, 12000 );
//        List result2 = BinarySearch.Lsearch(arr, 1000 );
//        System.out.println(result);
//        for (int i = 0; i <result2.size() ; i++) {
//            System.out.println(result2.get(i));
//        }
        int result = BinarySearch.searchRec(arr, 89, 0, 6);
        System.out.println(result);
    }


}
