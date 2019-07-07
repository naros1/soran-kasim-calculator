package com.kodilla;

public class Calculator {
    private int a;
    private int b;


    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int sum(){
        return a + b;
    }
    public int subtract(){
        return a-b;
    }
    public static void main(String args[]){
        Calculator toCalculate = new Calculator(3,5);
        System.out.println(toCalculate.sum());
        System.out.println(toCalculate.subtract());
    }
}
