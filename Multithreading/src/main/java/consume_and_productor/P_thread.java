/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

package consume_and_productor;

/**
 * @FileName: P_thread.java
 * @Description: P_thread.java类说明
 * @Author: guohao
 * @Date: 2019/8/19 15:23
 */
public class P_thread extends Thread {
    private P p;

    public P_thread(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.pushService();
        }

    }
}
