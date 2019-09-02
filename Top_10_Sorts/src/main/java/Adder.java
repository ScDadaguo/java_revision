import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Adder {
    private static String add(String num1, String num2)
    {
        int index = num1.indexOf(".");
        String beforeNum1 = num1.substring(0, index-1);
        String beforeNum2 = num2.substring(0, index-1);
        String afterNum1 = num1.substring(index + 1, num1.length());
        String afterNum2 = num2.substring(index + 1, num2.length());
        int lengthBefore = 0;
        String resultssBefore = "";
        if (beforeNum1.length() >= beforeNum2.length()) {
            lengthBefore = beforeNum2.length();
            resultssBefore = beforeNum1.substring(0, beforeNum1.length() - beforeNum2.length() - 1);
        } else {
            lengthBefore = beforeNum1.length();
            resultssBefore = beforeNum2.substring(0, beforeNum2.length() - beforeNum1.length() - 1);
        }

        int lengthAfter = 0;
        String resultssAfter = "";
        if (beforeNum1.length() >= beforeNum2.length()) {
            lengthAfter = afterNum2.length();
            resultssAfter = afterNum1.substring(0, afterNum1.length() - afterNum2.length() - 1);
        } else {
            lengthAfter = afterNum1.length();
            resultssAfter = afterNum2.substring(0, afterNum2.length() - afterNum1.length() - 1);
        }




        int next = 0;
        StringBuffer resultString = new StringBuffer("");
        List list = new ArrayList();
        for (int i = lengthBefore-1; i>=0 ; i--) {
            char a = beforeNum1.charAt(i);
            char b = beforeNum2.charAt(i);
            Integer.parseInt(String.valueOf(a));
            Integer.parseInt(String.valueOf(b));
            int result = (a + b+next) % 10;
            list.add(result);
            if (a + b +next>= 10) {
                next = 1;
            } else {
                next = 0;
            }
        }

        int next2 = 0;
        StringBuffer resultString2 = new StringBuffer("");
        List list2 = new ArrayList();
        for (int i = 0; i<lengthAfter ; i++) {
            char a = afterNum1.charAt(i);
            char b = afterNum2.charAt(i);
            Integer.parseInt(String.valueOf(a));
            Integer.parseInt(String.valueOf(b));
            int result = (a + b+next) % 10;
            list.add(result);
            if (a + b +next2>= 10) {
                next2 = 1;
            } else {
                next2 = 0;
            }
        }


        for (int i = resultssBefore.length()-1; i >=0 ; i--) {
            char c = resultssBefore.charAt(i);
            Integer.parseInt(String.valueOf(c));
            int result = (c+next) % 10;
            list.add(result);
            if (c +next>= 10) {
                next = 1;
            } else {
                next = 0;
            }
        }
        if (next == 1) {
            list.add(1);
        }

        for (int i = resultssAfter.length()-1; i >=0 ; i--) {
            char c = resultssAfter.charAt(i);
            Integer.parseInt(String.valueOf(c));
            int result = (c+next) % 10;
            list2.add(result);
            if (c +next2>= 10) {
                next2 = 1;
            } else {
                next2 = 0;
            }
        }
        if (next2 == 1) {
            list2.add(1);
        }
        StringBuffer stringBuffer = new StringBuffer("");
        for (int i = list.size()-1; i >=0 ; i--) {
            stringBuffer.append(list.get(i));
        }

        StringBuffer stringBuffer2 = new StringBuffer("");
        for (int i = 0; i <list2.size() ; i--) {
            stringBuffer2.append(list.get(i));
        }


        return stringBuffer.append(stringBuffer2).toString();

    }

    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
//
//        String num1 = sc.nextLine();
//        String num2 = sc.nextLine();
//
//        String sum = add(num1, num2);
//        System.out.println(sum);

    }
}