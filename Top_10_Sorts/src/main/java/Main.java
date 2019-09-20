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
    public static String validIpAddress(String IP) {
        if (IP.startsWith(":") || IP.startsWith(".")
                || IP.endsWith(":") || IP.endsWith(".")) {
            return "Neither";
        }

        String[] splitted = IP.split("\\.");
        if (splitted.length == 4) {
            int num = -1;
            for (int i = 0; i < 4; i++) {
                try {
                    num = Integer.parseInt(splitted[i]);
                } catch (Exception e) {
                    return "Neither";
                }
                if (num < 0 || num > 255) {
                    return "Neither";
                }

                if (splitted[i].length() > 1 && (splitted[i].startsWith("0") || splitted[i].startsWith("-"))) {
                    return "Neither";
                }
            }
            return "IPv4";
        } else {
            splitted = IP.split(":");
            if (splitted.length == 8) {
                int num = -1;
                for (int i = 0; i < 8; i++) {
                    int len = splitted[i].length();
                    if (splitted[i] == null || len > 4 || len == 0) {
                        return "Neither";
                    }
                    for (int j = 0; j < len; j++) {
                        char c = splitted[i].charAt(j);
                        if (!((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f')) || (c >= 'A' && c <= 'F')) {
                            return "Neither";
                        }
                    }
                }
                return "IPv6";
            } else {
                return "Neither";
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.next();
        System.out.println(validIpAddress(ip));
    }
}
