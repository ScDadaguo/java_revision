/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

package consume_and_productor2;

/**
 * @FileName: Producer.java
 * @Description: Producer.java类说明
 * @Author: guohao
 * @Date: 2019/8/20 9:38
 */
public class Producer {
    private Depot depot;

    public Producer(Depot depot) {
        this.depot = depot;
    }

    public void produce(final int val) {
        new Thread(() -> depot.produce(val)).start();
    }
}
