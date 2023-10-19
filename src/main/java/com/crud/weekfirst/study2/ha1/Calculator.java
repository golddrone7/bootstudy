package com.crud.weekfirst.study2.ha1;

import java.io.IOException;

public class Calculator {
    private int leftNum;
    private int rightNum;
    private Output output;
    private Input input;
    private Result result;

    public Calculator() {
        output = Output.getInstance();
        input = Input.getInstance();
    }

    public void process(){
        int cnt = 1;
        output.print("== 입력 ==");
        do {
            output.print("숫자 1 입력 : ");
            leftNum = generateNumber();
        } while (leftNum == 0);
        do {
            output.print("숫자 2 입력 : ");
            rightNum = generateNumber();
        } while (rightNum == 0);

        result = new Result(
                leftNum + rightNum,
                leftNum - rightNum,
                leftNum * rightNum,
                leftNum / rightNum,
                leftNum % rightNum
        );
        output.process(result);
    }

    public int generateNumber() {
        int num = 0;
        try {
            num = Integer.parseInt(input.inputProcess());
            if(num == 0) throw new IOException("두번째 숫자는 0이 될 수 없습니다.");
        } catch (NumberFormatException e) {
            output.print("정수로 입력해주세요.");
        } catch (IOException e){
            output.print(e.getMessage());
        }
        return num;
    }

    public int getLeftNum() {
        return leftNum;
    }

    public void setLeftNum(int leftNum) {
        this.leftNum = leftNum;
    }
    public int getRightNum() {
        return rightNum;
    }

    public void setRightNum(int rightNum) {
        this.rightNum = rightNum;
    }
}
