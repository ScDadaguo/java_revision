/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

import java.util.ArrayList;

/**
 * @FileName: FindContinuousSequence.java
 * @Description: 输出所有和为S的连续正数序列。
 * 序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 * @Author: guohao
 * @Date: 2019/8/24 13:57
 */


public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> listArrayList = new ArrayList<>();
        int left = 1;
        int right = 2;
        while (left < right) {
            int cur = (left + right) * (right - left + 1) / 2;
            if (cur == sum) {
                ArrayList<Integer> list =  new ArrayList();
                for (int i = left; i <= right; i++) {
                    list.add(i);
                }
                listArrayList.add(list);
                right++;
            } else if (cur < sum) {
                right++;
            } else {
                left++;
            }
        }
        return listArrayList;
    }
}
