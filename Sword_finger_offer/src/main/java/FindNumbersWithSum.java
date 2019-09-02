/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

import java.util.ArrayList;

/**
 * @FileName: FindNumbersWithSum.java
 * @Description: 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
 * 如果有多对数字的和等于S，输出两个数的乘积最小的。
 * 对应每个测试案例，输出两个数，小的先输出。
 * @Author: guohao
 * @Date: 2019/8/24 14:25
 */
public class FindNumbersWithSum {
    public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0;
        int right = array.length - 1;
        int product = Integer.MAX_VALUE;
        while (left < right) {
            if (array[left] + array[right] == sum) {
                int temp = left * right;
                if (temp<product) {
                    result.clear();
                    result.add(array[left]);
                    result.add(array[right]);
                    product = temp;
                }
                left++;
            } else if (array[left] + array[right] < sum) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 4, 7, 11, 15};
        FindNumbersWithSum(array, 15);
    }
}
