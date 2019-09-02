/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

/**
 * @FileName: ReplaceSpace.java
 * @Description: replaceSpace.java类说明
 * @Author: guohao
 * @Date: 2019/8/24 13:00
 */
public class ReplaceSpace {

    public String replaceSpace(StringBuffer str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

    }

}
