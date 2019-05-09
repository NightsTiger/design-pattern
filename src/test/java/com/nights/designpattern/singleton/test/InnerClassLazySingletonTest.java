package com.nights.designpattern.singleton.test;

import com.nights.designpattern.singleton.lazy.InnerClassLazySingleton;

/**
 * @author : dingwenqiang
 * @date : 2019/5/7 23:26
 */
public class InnerClassLazySingletonTest {

    public static void main(String[] args) {
        InnerClassLazySingleton instance = InnerClassLazySingleton.getInstance();
    }
}
