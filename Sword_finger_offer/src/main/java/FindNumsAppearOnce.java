/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @FileName: FindNumsAppearOnce.java
 * @Description: FindNumsAppearOnce.java类说明
 * @Author: guohao
 * @Date: 2019/8/24 13:41
 */
public class FindNumsAppearOnce {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (!list.contains(array[i])) {
                list.add(array[i]);
            } else {
                list.remove(list.indexOf(array[i]));
            }
        }
        num1[0] = (int) list.get(0);
        num2[0] = (int) list.get(1);
    }
}
