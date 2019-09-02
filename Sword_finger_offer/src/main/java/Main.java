/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.security.krb5.SCDynamicStoreConfig;

import java.util.*;

/**
 * @FileName: Main.java
 * @Description: Main.java类说明
 * @Author: guohao
 * @Date: 2019/8/31 16:36
 */
public class Main {


    public static void main(String[] args) {
//        String sc = new Scanner(System.in).nextLine();
//        Map<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i <sc.length() ; i++) {
//            char temp = sc.charAt(i);
//            if (map.containsKey(temp)) {
//                map.put(temp, map.get(temp) + 1);
//            } else {
//                map.put(temp, 1);
//            }
//        }
//        int maxnum = Collections.max(map.values());
//        System.out.println(maxnum);

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<Integer> dList = new ArrayList();
        for (int i = 0; i < M; i++) {
            int a=sc.nextInt();
            dList.add(a);
        }
        int tmep = N;
        for (int i = 1; i <=N ; i++) {
            int prev = i;
            for (int d:dList) {
                //两边都不能走
                if (prev + d > tmep && prev - d < 1) {
                    tmep--;
                    break;
                    //能走右边
                } else if (prev + d <= tmep && prev - d < 1) {

                    prev = 1 + d;

                    //能走左边
                } else if (prev + d > tmep && prev - d >= 1) {
                    prev = 1 - d;
                    //两边都能走
                } else {

                }
            }
        }
        System.out.println(tmep);


    }

//    public static void go(ArrayList<Integer> list,int N) {
//        for (int prev = 1; prev <=N ; prev++) {
//            for (int d:list) {
//                //两边都不能走
//                if (prev + d > N && prev - d < 1) {
//                    N--;
//                    break;
//                    //能走右边
//                } else if (prev + d <= N && prev - d < 1) {
//
//                    prev = 1 + d;
//
//                    //能走左边
//                } else if (prev + d > N && prev - d >= 1) {
//                    prev = 1 - d;
//
//
//                    //两边都能走
//                }
//            }
//        }



    }

