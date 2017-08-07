package com.hust.corey;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/8/7.
 */
public class TalkRubbish implements InvocationHandler{
    private Object showLove;
    public TalkRubbish(Object showLove){
        this.showLove = showLove;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("It's a good day,isn't it?");
        System.out.println("How about having dinner together?");
        Object result = method.invoke(showLove,args);
        System.out.println("(after one second)");
        System.out.println("I will never give up.");
        System.out.println("(what a sad story)");
        return result;
    }
}
