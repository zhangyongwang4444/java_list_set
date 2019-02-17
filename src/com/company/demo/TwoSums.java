package com.company.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TwoSums {
    ArrayList<Integer> twoSums(ArrayList<Integer> nums, Integer target) {

        // 出现过什么样的数字,可能有重复
        Set<Integer> numSet = new HashSet<>();

        for (Integer num : nums) {
            numSet.add(num);
        }

        //找到一对数的和 == target
        for (Integer num : nums) {
            if (numSet.contains(target - num)) {
                ArrayList<Integer> result = new ArrayList<>();
                result.add(num);
                result.add(target - num);
                return result;
            }
        }
    }
}
