/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

package consume_and_productor2;

/**
 * @FileName: Customer.java
 * @Description: Customer.java类说明
 * @Author: guohao
 * @Date: 2019/8/20 9:38
 */
public class Customer {
    private Depot depot;

    public Customer(Depot depot) {
        this.depot = depot;
    }

    public void consume(final int val) {
        new Thread(() -> depot.consume(val)).start();
    }
}
