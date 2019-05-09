package com.nights.designpattern.singleton.lazy;

/**
 * @author : dingwenqiang
 * @date : 2019/5/7 23:05
 * @description : double check 单例
 */
public class DoubleCheckLazySingleton {

    //volatile 保证new的时候，不发生指令重排序。
    private volatile static DoubleCheckLazySingleton instance = null;

    private DoubleCheckLazySingleton(){}

    public static DoubleCheckLazySingleton getInstance(){
        //第一层提升性能，如果已经实例化过了，就直接返回，不需要再去竞争锁
        if(instance == null){
            synchronized (DoubleCheckLazySingleton.class){
                //第二层保证只有一个实例
                if (instance == null) {
                    instance = new DoubleCheckLazySingleton();
                    //1.分配内存给对象
                    //2.初始化对象
                    //3.将instance变量指向刚分配的内存地址
                    //4.初次访问对象
                }
            }
        }
        return instance;
    }
}
