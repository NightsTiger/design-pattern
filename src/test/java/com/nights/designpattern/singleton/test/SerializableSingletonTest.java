package com.nights.designpattern.singleton.test;

import com.nights.designpattern.singleton.serializable.SerializableSingleton;

import java.io.*;

/**
 * @author : dingwenqiang
 * @date : 2019/5/8 22:56
 */
public class SerializableSingletonTest {

    //test -> 序列化破坏单例
    public static void main(String[] args) throws IOException {
        SerializableSingleton instanceA = SerializableSingleton.getInstance();
        SerializableSingleton serializableInstance = null;

        FileOutputStream fileOutputStream = null;
        ObjectOutputStream oos = null;
        FileInputStream fileInputStream = null;
        ObjectInputStream ois = null;

        try {
            fileOutputStream = new FileOutputStream(new File("SerializableSingleton.obj"));
            oos = new ObjectOutputStream(fileOutputStream);
            oos.writeObject(instanceA);
            oos.flush();

            fileInputStream = new FileInputStream("SerializableSingleton.obj");
            ois = new ObjectInputStream(fileInputStream);
            //readObject 参考 hasReadResolveMethod 把readResolve方法返回值赋值给返回对象
            serializableInstance = (SerializableSingleton) ois.readObject();

            System.out.println("instanceA" + instanceA);
            System.out.println("serializableInstance" + serializableInstance);
            System.out.println(instanceA == serializableInstance);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            assert fileOutputStream != null;
            fileOutputStream.close();

            assert oos != null;
            oos.close();

            assert fileInputStream != null;
            fileInputStream.close();

            assert ois != null;
            ois.close();
        }
    }
}
