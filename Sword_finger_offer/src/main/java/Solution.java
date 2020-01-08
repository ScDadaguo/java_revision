
//入一个链表，输出该链表中倒数第k个结点。

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa bbb ccc");
        list.add("ddd eee fff");
        list.add("ggg hhh iii");

        list = list.stream().map(s -> s.split(" ")).flatMap(strings -> Stream.of(strings)).collect(toList());
//        list.forEach(s-> System.out.println(s));

    }
}