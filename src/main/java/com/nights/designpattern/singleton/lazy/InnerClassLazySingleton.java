package com.nights.designpattern.singleton.lazy;

/**
 * @author : dingwenqiang
 * @date : 2019/5/7 23:09
 * @description : 内部类懒汉式单例
 */
public class InnerClassLazySingleton {

    private InnerClassLazySingleton (){
        if (LazyHolder.LAZY != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    //static 保证静态，直接类名调用
    //方法final修饰，不可被重写和重载
    public static final InnerClassLazySingleton getInstance(){
        return LazyHolder.LAZY;
    }

    private static class LazyHolder{
        //当这个属性被访问的时候再加载
        private static final InnerClassLazySingleton LAZY = new InnerClassLazySingleton();
    }


}
