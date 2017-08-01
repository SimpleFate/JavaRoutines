package com.hust.corey;


public class AnnotationsTest {

    @Customer(pieces = 2)
    public void method01(String str){
        System.out.println("method01:"+str);
    }

    @Customer(pieces = 3,prefix = "three times")
    public void method02(String str){
        System.out.println("method02:"+str);
    }

}
