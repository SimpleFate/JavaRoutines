package com.hust.corey;

public class Main{

    public static void main(String[] args){
        AnnotationsTest t = new AnnotationsTest();
        ReflectionAndAnnoRunner runner = new ReflectionAndAnnoRunner(t);
        runner.RunTest("hello world");
    }
}