package com.company;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class LargestPrimeFactor {

    /*
    The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
     */

    /*
    Wie man Primfaktoren berechnet: https://www.mathepower.com/primfaktor.php
     */

    private final static long TARGET = 600851475143L;

    public static void main(String[] args) {
        List<Long> primeFactorList = new ArrayList<>();

        long current = TARGET;

        //finde alle Primzahlen
        //+2 weil nur ungerade Zahlen Primzahlen sein können (abgesehen von der 2)
        //600851475143L kann nicht durch 2 teilbar sein, deswegen mit 3 starten
        long i = 3;
        while(i <= TARGET/2){
            if(isPrime(i)){
                if(current % i == 0){
                    System.out.println("Aktuelle Zahl " + current + " ist durch " + i + " teilbar");
                    current /= i;
                    System.out.println("Neue Zahl " + current);
                    primeFactorList.add(i);
                    continue;
                }
            }

            //i+2 weil nur ungerade Zahlen Primzahlen sein können
            i = i+2;
        }
    }

    private static boolean isPrime(long number){
        //Teiler Stumpf testen
        //+2 um nur mit ungeraden Zahlen zu testen, da ne gerade Zahl nicht der Teiler einer ungeraden Zahl sein kann
        for(int i = 3; i < number/2; i+= 2){
            if(number % i == 0){
                return false;
            }
        }

        return true;
    }
}
