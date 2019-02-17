package com.company.demo;

import java.util.*;

public class TwoSums {
    public ArrayList<Integer> twoSums(ArrayList<Integer> nums, Integer target) {

        // 出现过什么样的数字为 key ,他的原来位置为value
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.size(); i++) {
            numMap.put(nums.get(i), i);
        }


        //找到一对数的和 == target!!
        for (int j = 0; j < nums.size(); j++) {
            if (numMap.containsKey(target - nums.get(j))) {
                ArrayList<Integer> result = new ArrayList<>();
                result.add(j);
                result.add(numMap.get(target - nums.get(j)));
                System.out.println(result);
                return result;
            }
        }
        return null;
    }
}
