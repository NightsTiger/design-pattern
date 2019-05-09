package com.nights.designpattern.singleton.test;

import com.nights.designpattern.singleton.lazy.InnerClassLazySingleton;

import java.lang.reflect.Constructor;

/**
 * @author : dingwenqiang
 * @date : 2019/5/8 23:12
 */
public class ReflectSingletonTest {
    //test -> 反射破坏单例
    public static void main(String[] args) {
        try {

            Class<?> clazz = InnerClassLazySingleton.class;
            //通过反射可以拿到私有构造方法
            Constructor<?> constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);

            //暴力初始化
            //如果构造方法不抛异常，就会进行两次new
            InnerClassLazySingleton o1 = (InnerClassLazySingleton) constructor.newInstance();
            InnerClassLazySingleton o2 = (InnerClassLazySingleton) constructor.newInstance();

            System.out.println(o1 == o2);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
