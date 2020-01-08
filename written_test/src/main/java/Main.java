/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

import java.math.BigDecimal;
import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/**
 * @FileName: Main.java
 * @Description: Main.java类说明
 * @Author: guohao
 * @Date: 2019/8/20 19:24
 */
public class Main {
    public static void main(String[] args) {
//        List<Person> personList = new ArrayList<>();
//        personList.add(new Person("wang",18,1));
//        personList.add(new Person("li",20,1));
//        personList.add(new Person("guohao",22,2));
//        personList.add(new Person("guohao2",22,1));
//        personList.add(new Person("hhd",24,1));
//        personList.add(new Person("ai",22,2));
//        personList.add(new Person("gti",24,1));
//
//        Map<Integer, Map<Integer, List<Person>>> map = personList.stream().collect(groupingBy(Person::getAge,groupingBy(Person::getSex)));
//        System.out.println(map.toString());
        BigDecimal bigDecimal = new BigDecimal("1.0");
        BigDecimal bigDecimal2 = new BigDecimal("2.00");
        BigDecimal bigDecimal3 = new BigDecimal("3.00");
        System.out.println(bigDecimal.max(bigDecimal2));

//        List<BigDecimal> list = new ArrayList<>();
//        list.add(bigDecimal);
//        list.add(bigDecimal2);
//        list.add(bigDecimal3);
//        BigDecimal sum = list.stream().max(BigDecimal::compareTo).get();
//        System.out.println(sum);
//        System.out.println(BigDecimal.valueOf(Long.MAX_VALUE));
//        System.out.println(  Long.MAX_VALUE);
//        Long l = new Long("2.3");
//        System.out.println(l);


//        System.out.println(sum);
//        System.out.println(bigDecimal.compareTo(bigDecimal2));
//        System.out.println(bigDecimal.equals(bigDecimal2));
//        System.out.println(BigDecimal.ONE);
//        System.out.println(BigDecimal.TEN.add(new BigDecimal("2.44")));


    }

    public static class Person{
        private String name;
        private Integer age;
        private int sex;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Person(String name, Integer age,int sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex=" + sex +
                    '}';
        }
    }
}
