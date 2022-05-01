package com.company;

public class SmallestMultiple {

    /*
    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
     */

    private static final int MIN = 2520;

    public static void main(String[] args) {
        outer:
        for(long i = MIN; true; i += 20){

            //no need to test with div = 20 if we increment by 20
            for(int div = 1; div < 20; div++){
                if(i % div != 0) continue outer;
            }

            System.out.println(i);
            break;
        }
    }
}
