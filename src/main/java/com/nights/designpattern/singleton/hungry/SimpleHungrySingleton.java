package com.nights.designpattern.singleton.hungry;

/**
 * @author : dingwenqiang
 * @date : 2019/5/7 23:06
 * @description : 简单饿汉式单例
 */
public class SimpleHungrySingleton {

    //没有锁，效率高
    //绝对的线程安全，但是会随着类加载而加载，浪费资源
    private static final SimpleHungrySingleton instance = new SimpleHungrySingleton();

    private SimpleHungrySingleton(){}

    public static SimpleHungrySingleton getInstance() {
        return instance;
    }

}
