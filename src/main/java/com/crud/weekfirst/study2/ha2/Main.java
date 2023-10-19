package com.crud.weekfirst.study2.ha2;

import java.util.Scanner;

public class Main {

    public static boolean[] prime;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        make_prime(n);
        for (int i = 0; i < prime.length; i++) {
            if(prime[i] == false){
                System.out.println(i);
            }
        }
    }
    public static void make_prime(int a){
        prime = new boolean[a + 1];

        if(a < 2 ){
            return;
        }

        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if(prime[i] == true){
                continue;
            }
            for(int j = i * i; j < prime.length; j = j+i){
                prime[j] = true;
            }

        }


    }


}
