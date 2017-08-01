package com.hust.corey;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ReflectionAndAnnoRunner {
    AnnotationsTest test;
    public ReflectionAndAnnoRunner(AnnotationsTest test){
        this.test = test;
    }
    public void RunTest(String param){
        Method[] methods = test.getClass().getMethods();
        for(Method m : methods){
            Annotation[] annos = m.getAnnotations();
            int pieces = 1;
            String prefix = "";
            for(Annotation anno : annos){
                if(anno.annotationType().equals(Customer.class)){
                    Customer customer = (Customer) anno;
                    pieces = customer.pieces();
                    prefix = customer.prefix();
                    System.out.println("---INVOKING IS STARTING---");
                    System.out.println(prefix);
                    Object[] params = new Object[1];
                    params[0] = param;
                    try{
                        for(int i=0;i<pieces;i++){
                            m.invoke(test,param);
                        }
                    }catch (Exception e){
                        System.out.println("invoking failed:" + e.getMessage());
                    }
                    System.out.println("---INVOKING IS ENDING---\n");
                    break;
                }

            }


        }

    }
}
