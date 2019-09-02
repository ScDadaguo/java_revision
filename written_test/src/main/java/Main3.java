///*
// * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
// */
//
//import java.util.Scanner;
//
///**
// * @FileName: Main.java
// * @Description: Main.java类说明
// * @Author: guohao
// * @Date: 2019/8/20 20:15
// */
//public class Main {
//
//    private Scanner sc;
//
//    int[] weightArray;
//    int[] priceArray;
//    int n;
//    int w;
//    int dp[][];
//
//    public Main() {
//        sc = new Scanner(System.in);
//        n = sc.nextInt();
//        w = sc.nextInt();
//        weightArray = new int[n];
//        priceArray = new int[n];
//
//        for (int k = 0; k < n; k++) {
//            weightArray[k] = sc.nextInt();
//        }
//        for (int k = 0; k < n; k++) {
//            priceArray[k] = sc.nextInt();
//        }
//        dp = new int[n + 1][w + 1];
//    }
//
//
//    public int rec(int i, int j) {
//        if (dp[i][j] > 0) {
//            return dp[i][j];
//        }
//        int res;
//        if (i == n) {
//            res = 0;
//        } else if (j < weightArray[i]) {
//            res = rec(i + 1, j);
//        } else {
//            res = Math.max(rec(i + 1, j), rec(i + 1, j - weightArray[i]) + priceArray[i]);
//        }
//        return dp[i][j] = res;
//    }
//
//    public static void main(String[] args) {
//        Main test = new Main();
//        System.out.println(test.rec(0, test.w));
//
//    }
//
//}
