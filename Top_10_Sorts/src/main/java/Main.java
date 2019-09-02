/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @FileName: Main.java
 * @Description: Main.java类说明
 * @Author: guohao
 * @Date: 2019/8/15 19:52
 */
public class Main {
    public static void main(String[] args) {
        int a[][] = new int[100][100] ;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> hanglist = new ArrayList<>();
        List<Integer> lielist = new ArrayList<>();
        int lieMax = 0;
        int hangMax = 0;
        int zeroNums = 0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                int temp= scanner.nextInt();
                if (temp != 0) {
                    zeroNums++;
                }
                a[i + 1][j + 1] = temp;
                if (temp >= hangMax) {
                    hangMax = temp;
                }
            }
            hanglist.add(hangMax);
        }
        for (int j = 0; j <m ; j++) {
            for (int i = 0; i <n ; i++) {
                int temp = a[i + 1][j + 1];
                if (temp >= lieMax) {
                    lieMax = temp;
                }
            }
            lielist.add(lieMax);
        }
        int sum1 = 0;
        for (int i = 0; i <lielist.size() ; i++) {
            sum1 = lielist.get(i) + sum1;
        }
        sum1 = sum1 * 2;

        int sum2 = 0;
        for (int i = 0; i <hanglist.size() ; i++) {
            sum2 = hanglist.get(i) + sum2;
        }
        sum2 = sum2* 2;

        System.out.println(sum1 + sum2 + zeroNums);

    }
}
