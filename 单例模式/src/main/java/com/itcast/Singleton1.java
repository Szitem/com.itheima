package com.itcast;

/**
 * @author:WandDeKai
 * @date:Created in 2019/8/20
 * @param:
 * @description: 饿汉单例
 * @version:1.0
 */
public class Singleton1 {
    //创建一个对象
    private static Singleton1 singleton1=new Singleton1();
    //构建一个私有构造方法
    private Singleton1() { }
    //以自己实例为返回值的静态的共有方法,静态化工厂方法
    public static Singleton1 getSingleton1(){
        System.out.println();
        return singleton1;
    }
}

