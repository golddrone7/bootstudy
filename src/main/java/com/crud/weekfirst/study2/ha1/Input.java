package com.crud.weekfirst.study2.ha1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    private final static Input input = new Input();
    private BufferedReader br;

    private Input(){
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public static Input getInstance(){
        return input;
    }

    public String inputProcess(){
        try {
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
