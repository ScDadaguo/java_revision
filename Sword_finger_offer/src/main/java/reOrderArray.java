/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

/**
 * @FileName: reOrderArray2.java
 * @Description: 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @Author: guohao
 * @Date: 2019/9/2 10:21
 */
public class reOrderArray {
    public void reOrderArray(int [] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (isEven(array[i])) {
                    if (!isEven(array[j])) {
                        temp = array[j];
                        for (int k = j-1; k>=i ; k--) {
                            array[k + 1]=array[k] ;
                        }
                        array[i] = temp;
                        break;
                    }

                }
            }
        }
    }


    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }


}
