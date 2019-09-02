/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

/**
 * @FileName: LeftRotateString.java
 * @Description:
 *  无力吐槽你们的做法了，这种AC，你们觉得面试能过吗？
 *  这道题考的核心是应聘者是不是可以灵活利用字符串翻转。
 *  假设字符串abcdef，n=3，设X=abc，Y=def，所以字符串可以表示成XY，
 *  如题干，问如何求得YX。假设X的翻转为XT，XT=cba，同理YT=fed，那么YX=(XTYT)T，三次翻转后可得结果。
 *
 * @Author: guohao
 * @Date: 2019/8/24 15:08
 */
public class LeftRotateString {
    public String LeftRotateString(String str,int n) {
        if (str.length()<n) {
            return "";
        }
        int len = str.length() ;
        StringBuffer result = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer(str.substring(0,n));
        StringBuffer stringBuffer2 = new StringBuffer(str.substring(n, len));
        stringBuffer1.reverse();
        stringBuffer2.reverse();
        result.append(stringBuffer1).append(stringBuffer2).reverse();
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "1234";
        System.out.println(str.substring(0, 3));
    }
}
