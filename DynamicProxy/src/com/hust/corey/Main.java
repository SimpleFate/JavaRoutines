package com.hust.corey;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
	    TalkRubbish talkRubbish = new TalkRubbish(new TheFirstTime());
	    FindAGirlfriend firstTime = (FindAGirlfriend) Proxy.newProxyInstance(
	            TheFirstTime.class.getClassLoader(),
                TheFirstTime.class.getInterfaces(),
                talkRubbish);
	    firstTime.showLove("Cui Hua");
    }
}
