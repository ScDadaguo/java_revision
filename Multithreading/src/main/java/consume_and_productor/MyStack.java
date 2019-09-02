/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

package consume_and_productor;

import java.util.ArrayList;
import java.util.List;

/**
 * @FileName: MyyStack.java
 * @Description: MyyStack.java类说明
 * @Author: guohao
 * @Date: 2019/8/19 15:16
 */
public class MyStack {
    private List<String> list = new ArrayList();

    synchronized public void push() {
        try {
            while (list.size() == 1) {
                this.wait();
            }
            list.add("anything=" + Math.random());
            this.notifyAll();
            System.out.println("push=" + list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public String pop() {
        String returnValue = "";
        try {
            while (list.size() == 0) {
                System.out.println("仓库里没有东西可消费，pop操作中的" + Thread.currentThread().getName() + "线程呈wait状态");
                this.wait();
            }
            returnValue = "" + list.get(0);
            list.remove(0);
            this.notifyAll();
            System.out.println("pop=" + list.size());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return returnValue;
    }

}
