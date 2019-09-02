/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

package consume_and_productor;

import java.util.ArrayList;
import java.util.List;

/**
 * @FileName: Main.java
 * @Description: Main.java类说明
 * @Author: guohao
 * @Date: 2019/8/19 15:32
 */
public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P_thread[] p_threads = new P_thread[5];
        C_thread[] c_threads = new C_thread[5];
        for (int i = 0; i <5 ; i++) {
            p_threads[i] = new P_thread(new P(myStack));
            c_threads[i] = new C_thread(new C(myStack));
        }
        for (int i = 0; i <5 ; i++) {
            p_threads[i].start();
            c_threads[i].start();
        }
    }
}
