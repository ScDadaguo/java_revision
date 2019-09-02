/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

/**
 * @FileName: Power.java
 * @Description: Power.java类说明
 * @Author: guohao
 * @Date: 2019/9/2 10:09
 */
public class Power {
    public double Power(double base, int exponent) {
        double res = 1;
        int n;
        if (exponent > 0) {
            n = exponent;
        } else if (exponent < 0) {
            if (base == 0) {
                throw new RuntimeException("分母不能为0");
            }
            n = -exponent;
        } else {
            return 1;
        }
        while (n != 0) {
            if ((n & 1) == 1) {
                res = res * base;
            }

            n >>= 1;
            base = base * base;

        }
        return exponent > 0 ? res : (1 / res);

    }
}
