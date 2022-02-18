package com.company;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MultiplesOf3Or5 {

    /*
    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

    Find the sum of all the multiples of 3 or 5 below 1000.
     */

    private static final int MAX = 1000;

    public static void main(String[] args) {

        Set<Integer> nums = new HashSet<>();
        int sum = 0;

        for(int i = 3; i < MAX; i+=3){
            nums.add(i);
            sum += i;
        }
        System.out.println(sum);
        for(int i = 5; i < MAX; i += 5){
            if(!nums.contains(i)){
                sum += i;
            }
        }

        System.out.println(sum);

    }
}
