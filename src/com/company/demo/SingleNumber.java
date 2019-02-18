package com.company.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> numMap = new HashMap();

        for (int num : nums) {
            if (numMap.containsKey(num)) {
                numMap.put(num, 2);
            } else {
                numMap.put(num, 1);
            }
        }

        for (Integer num : numMap.keySet()) {
            if (numMap.get(num) == 1) {
                System.out.println(num);
                return num;
            }
        }
        return 0;
    }
}
