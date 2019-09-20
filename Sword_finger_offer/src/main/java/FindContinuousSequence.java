/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

import java.util.ArrayList;

/**
 * @FileName: FindContinuousSequence.java
 * @Description: 输出所有和为S的连续正数序列。
 * 序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 *
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
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
