package com.nights.designpattern.singleton.enumsington;

/**
 * @author : dingwenqiang
 * @date : 2019/5/8 23:23
 */

//枚举式单例
public enum EnumSingleton {

    INSTANCE;

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

}
