package com.nights.designpattern.singleton.serializable;

import java.io.Serializable;

/**
 * @author : dingwenqiang
 * @date : 2019/5/7 23:34
 * 反序列化会破坏单例
 * 反序列化时，通过IO流的读取，将读取的内容转换为Java对象，此时需要重新创建对象。
 */
public class SerializableSingleton implements Serializable {

    private static final long serialVersionUID = 6092274297170744507L;

    private SerializableSingleton(){}

    private static final SerializableSingleton instance = new SerializableSingleton();

    public static SerializableSingleton getInstance(){
        return instance;
    }

    //反序列化时，会判断有无此方法，如果有，则把该返回值返回
    private Object readResolve() {
        return instance;
    }

}
