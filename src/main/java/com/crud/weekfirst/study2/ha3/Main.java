package com.crud.weekfirst.study2.ha3;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        ArrayList<Integer> primes = getPrimes(scanner.nextInt());
        for (Integer prime : primes) {
            System.out.println(prime);
        }
    }

    static ArrayList<Integer> getPrimes(int n){
        ArrayList<Integer> memo = new ArrayList<>();
        memo.add(2);

        for(int i = 2 ; i <= n ; ++i){
            for(int j = 0 ; j < memo.size() ; ++j){
                if(i % memo.get(j) == 0) break; // 소수로 나누어 떨어지면 소수가 아니다.
                if((j + 1) == memo.size()) memo.add(i); // 이전까지의 모든 소수로 나누어 떨어지지 않으면 소수다.
            }
        }
        return memo;
    }
}
