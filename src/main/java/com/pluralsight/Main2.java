package com.pluralsight;

public class Main2 {

    public static void main(String[] args){

       int a = 3;
       int b = 6;
       int result;

     result = add(a, b);

     System.out.println(result);


      result =  add(2,5);
        System.out.println(result);


    }


    public static int add( int num1,  int num2) {
        return num1 + num2;
    }


}
