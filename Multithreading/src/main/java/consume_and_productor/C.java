/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

package consume_and_productor;

/**
 * @FileName: C.java
 * @Description: C.java类说明
 * @Author: guohao
 * @Date: 2019/8/19 15:25
 */
public class C {
    private MyStack myStack;

    public C(MyStack myStack) {
        this.myStack = myStack;
    }
    public void popService(){
        System.out.println("pop="+myStack.pop());
    }

}
