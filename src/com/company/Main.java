package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // 集合

        //列表
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // homework : 理解 linkedList

        arrayList.add("test");
        arrayList.get(0);
        arrayList.subList(0, 0);

        // for 循环 遍历 列表
        for (String item : arrayList) {
            System.out.println(item);
        }

        // Set -- 主要用于 去重操作
        Set<String> set = new HashSet<>();

        set.add("abc");
        set.add("alex");
        set.add("john");
        set.add("alex");
        set.add("abc");

        for (String item : set) {
            System.out.println(item);
        }


    }
}
