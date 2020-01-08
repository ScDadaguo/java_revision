/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */



import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * @FileName: Main.java
 * @Description: 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 * @Author: guohao
 * @Date: 2019/8/31 16:36
 * f(n)=f(n-1)+f(n-2)
 */
public class Main {
    public static void main(String[] args) {
//        List<Person> list1 = new ArrayList<>();
//        List<Human> list2 = new ArrayList<>();
//        Person person1 = new Person(1, "wang");
//        Person person2 = new Person(2, "li");
//        Person person3 = new Person(3, "guo");
//
//        list1.add(person1);
//        list1.add(person2);
//        list1.add(person3);
//
//        Human human1 = new Human(1,"gang");
//        Human human2 = new Human(2,"chong");
//        Human human3 = new Human(3,"gou");
//        Human human4 = new Human(4,"ni");
//
//        list2.add(human1);
//        list2.add(human2);
//        list2.add(human3);
//        list2.add(human4);
//
//        List<Integer> humanNewList=list2.stream().map(person->person.getId()).collect(Collectors.toList());
//        List<Person> personList=list1
//                .stream()
//                .filter(person -> humanNewList.contains(person.id))
//                .collect(Collectors.toList());
//        personList.forEach(person -> {
//            System.out.println(person);
//            list2.stream().filter(human -> human.id == person.id).forEach(human -> System.out.println(human));
//        });
//        System.out.println(CnoocOmPayStatusEnum.PAY_STATUS_PAID.toString());

//        Date date = new Date();
        BigDecimal amt = new BigDecimal("3.7");
        BigDecimal[] results = amt.divideAndRemainder(new BigDecimal("1.2"));
        System.out.println(results[0]);
        System.out.println(results[1].compareTo(BigDecimal.ZERO));
    }

    public <T,E> void listContaiAll(List<T> list1, List<E> list2) {

    }
    
    static class Person{
        int id;
        String  name;

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    
    static class Human{
        private int id;
        private String str;

        public Human(int id, String str) {
            this.id = id;
            this.str = str;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }

        @Override
        public String toString() {
            return "Human{" +
                    "id=" + id +
                    ", str='" + str + '\'' +
                    '}';
        }
    }
    
    


}

