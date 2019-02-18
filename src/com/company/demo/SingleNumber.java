package com.company.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            if (numSet.contains(num)) {
                numSet.remove(num);
            } else {
                numSet.add(num);
            }
        }

        for (Integer num : numSet) {
            System.out.println(num);
            return num;
        }
        return 0;
    }
}
