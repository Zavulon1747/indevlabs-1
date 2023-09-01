package com.damselbeing.indevlabs;

import org.springframework.stereotype.Component;
//need some comments
@Component
public class Task {

    public Task() {
    }

    public int findMissingNumber(int[] array) {
        if(array.length == 0) {
            throw new IllegalArgumentException();
        }

        int min = Integer.MAX_VALUE;
        //use more descriptive variable names (sumWithMissingNumber instead of sum_b)
        int sum_b = 0; //camelCase instead of snake_case

        for(int i : array) {
            min = Math.min(i, min);
            sum_b += i;
        }

        int len = array.length + 1;
        int sum_a = (int)(len / 2.0 * (2.0 * min + (len - 1)));

        return sum_a - sum_b;
    }

}
