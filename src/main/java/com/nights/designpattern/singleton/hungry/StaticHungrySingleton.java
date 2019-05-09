package com.nights.designpattern.singleton.hungry;

/**
 * @author : dingwenqiang
 * @date : 2019/5/7 23:07
 * @description : 静态块饿汉式单例
 */
public class StaticHungrySingleton {

    private static final StaticHungrySingleton instance ;

    static {
        instance = new StaticHungrySingleton();
    }

    private StaticHungrySingleton(){}

    public static StaticHungrySingleton getInstance(){
        return instance;
    }

}
