/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @FileName: Main2.java
 * @Description: Main2.java类说明
 * @Author: guohao
 * @Date: 2019/8/20 19:57
 */
public class Main2 {
    public static String getMinNumber(String[] numbers) {
        int len = numbers.length;
        if (len == 0) {
            return "";
        }
        if (len == 1) {
            return numbers[0];
        }
        StringBuffer res = new StringBuffer();
        String[] str = new String[len];
        for (int i = 0; i < len; i++) {
            str[i] = numbers[i];
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String a = o1 + o2;
                String b = o2 + o1;
                return a.compareTo(b);
            }
        });
        for (int i = 0; i < len; i++) {
            res.append(str[i]);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.nextLine();
        String[] a = target.split(",");
        System.out.println(getMinNumber(a));

    }
}
