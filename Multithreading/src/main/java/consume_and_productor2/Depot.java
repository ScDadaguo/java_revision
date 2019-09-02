/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

package consume_and_productor2;

/**
 * @FileName: Depot.java
 * @Description: 仓库
 * @Author: guohao
 * @Date: 2019/8/20 9:26
 */
public class Depot {
    /**
     * 仓库的容量
     */
    private int capacity;
    /**
     * 仓库的实际容量
     */
    private int size;

    public Depot(int capacity) {
        this.capacity = capacity;
    }


    public synchronized void produce(int val) {
        try {
            // left 表示“想要生产的数量”(有可能生产量太多，需多此生产)
            int left = val;
            while (left > 0) {
                while (size >= capacity) {
                    wait();
                }
                int inc = (size + left) > capacity ? (capacity - size) : left;
                size += inc;
                left -= inc;
                System.out.printf("%s produce(%3d) --> left=%3d, inc=%3d, size=%3d\n",
                        Thread.currentThread().getName(), val, left, inc, size);
                notifyAll();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void consume(int val) {
        try {
            int left = val;
            while (left > 0) {
                while (size <= 0) {
                    wait();
                }
                int dec = (size < left) ? size : left;
                size -= dec;
                left -= dec;
                System.out.printf("%s consume(%3d) <-- left=%3d, dec=%3d, size=%3d\n",
                        Thread.currentThread().getName(), val, left, dec, size);
                notifyAll();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "capacity:" + capacity + ", actual size:" + size;
    }
}
