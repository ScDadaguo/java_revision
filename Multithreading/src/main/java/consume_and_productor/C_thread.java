/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

package consume_and_productor;

/**
 * @FileName: C_thread.java
 * @Description: C_thread.java类说明
 * @Author: guohao
 * @Date: 2019/8/19 15:23
 */
public class C_thread extends Thread{
    private C c;

    public C_thread(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            c.popService();
        }
    }
}
