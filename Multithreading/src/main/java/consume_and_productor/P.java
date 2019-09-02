/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

package consume_and_productor;

/**
 * @FileName: P.java
 * @Description: P.java类说明
 * @Author: guohao
 * @Date: 2019/8/19 15:23
 */
public class P {
    private MyStack myStack;

    public P(MyStack myStack) {
        this.myStack = myStack;
    }

    public void pushService(){
        myStack.push();
    }
}
