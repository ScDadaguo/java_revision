/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Random;

/**
 * @FileName: Test1.java
 * @Description: Test1.java类说明
 * @Author: guohao
 * @Date: 2019/8/10 16:07
 */
public class Test1 {

    @Test
    public void compare() {
        Integer[] DB_DATA = new Integer[10];
        Random random = new Random(10 * 10000);
        for (int i = 0; i < DB_DATA.length; i++) {
            DB_DATA[i] = random.nextInt();
        }
        long t = System.currentTimeMillis();
        String[] arr = new String[10000000];
        for (int i = 0; i < 10000000; i++) {
//            arr[i] = new String(String.valueOf(DB_DATA[i % DB_DATA.length]));                // --- 每次都要new一个对象
            arr[i] = new String(String.valueOf(DB_DATA[i % DB_DATA.length])).intern();    //其实虽然这么多字符串，但是类型最多为10个，大部分重复的字符串,大大减少内存
        }

        System.out.println((System.currentTimeMillis() - t) + "ms");
        System.gc();
    }

    @Test
    public void test1() {
        String s1 = new String("1");    // 同时会生成堆中的对象 以及常量池中1的对象，但是此时s1是指向堆中的对象的
        s1.intern();            // 常量池中的已经存在
        String s2 = "1";
        System.out.println(s1 == s2);
    }

    @Test
    public void test2(){
        BigDecimal bigDecimal = new BigDecimal(2.6);
        System.out.println(bigDecimal.compareTo(BigDecimal.valueOf(6.7)));
    }
}
