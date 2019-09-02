/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

import java.util.Scanner;

/**
 * @FileName: Main.java
 * @Description: Main.java类说明
 * @Author: guohao
 * @Date: 2019/8/20 19:24
 */
public class Main {
    public static void swap(char a, char b) {
        char temp = a;
        a = b;
        b = temp;
    }

    public static void swap_str(char[] str, int start, int end) {
        int low = start;
        int high = end;
        while (low < high) {
            swap(str[low], str[high]);
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.nextLine();
        String s=reverseSentence(target);
        System.out.println(target);
//        char[] str = target.toCharArray();
//        int s = 0;
//        int e = 0;
//        for (int i = 0; i <target.length() ; i++) {
//            e = i;
//            if (str[e] == ' ') {
//                swap_str(str, s, e - 1);
//                s = e + 1;
//            }
//
//        }
//        System.out.println(str);

    }

    public static String reverseSentence(String str) {
        if (str == null) {
            return str;
        }
        char[] cs = str.toCharArray();
        int begin = 0;
        int end = cs.length - 1;
        reverse(cs, begin, end);
        begin = end = 0;
        while (begin < cs.length) {
            if (cs[begin] == ' ') {
                begin++;
                end++;
            } else if (end == cs.length || cs[end] == ' ') {
                reverse(cs, begin, --end);
                begin = ++end;
            } else {
                end++;
            }
        }
        return new String(cs);
    }

    private static void reverse(char[] str, int begin, int end) {
        while (begin <= end) {
            char temp = str[begin];
            str[begin] = str[end];
            str[end] = temp;
            begin++;
            end--;

        }
    }
}
