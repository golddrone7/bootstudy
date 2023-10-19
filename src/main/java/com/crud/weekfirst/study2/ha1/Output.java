package com.crud.weekfirst.study2.ha1;

public class Output {
    private final static Output output = new Output();

    private Output(){}

    public static Output getInstance(){
        return output;
    }

    public void print(String text){
        System.out.println(text);
    }

    public void process(Result result){
        System.out.println("합 : " + result.get합());
        System.out.println("차 : " + result.get차());
        System.out.println("곱 : " + result.get곱());
        System.out.println("나눈 몫 : " + result.get나눈몫());
        System.out.println("나눈 나머지 : " + result.get나눈나머지());

    }


}
