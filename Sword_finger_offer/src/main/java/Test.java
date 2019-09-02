/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

/**
 * @FileName: FindNum.java
 * @Description: FindNum.java类说明
 * @Author: guohao
 * @Date: 2019/8/27 15:05
 */
public class Test {
    private  int zero = 0;
    private  int zeroIndex = 0;



    private  int positiveCounts = 0;
    private  int negitiveCounts = 0;



    public void init(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                zero++;
                zeroIndex = i;
            } else if (a[i] > 0) {
                positiveCounts++;
            } else {
                negitiveCounts++;
            }
        }
    }

    //求乘积的正负
    public int getP(int zero, int negitiveCounts) {
        if (zero != 0) {
            return 0;
        }

        if (negitiveCounts % 2 == 0) {
            return 1;
        }

        return -1;
    }


    public int getIndex(int flag,int[] a) {
        int index = 0;
        if (flag >= 1) {
            int cmp = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] > 0 && cmp > a[i]) {
                    cmp = a[i];
                    index = i;
                }
            }
        } else if (flag <= -1) {
            int cmp = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] < 0 && cmp > a[i]) {
                    cmp = a[i];
                    index = i;
                }
            }
        } else {
            int cmp = a[0];
            for (int i = 0; i < a.length; i++) {
                if (a[i] < 0 && cmp < a[i]) {
                    cmp = a[i];
                    index = i;
                }
            }
        }
        return index;
    }


}
