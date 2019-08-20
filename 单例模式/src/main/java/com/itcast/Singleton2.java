package com.itcast;

/**
 * @author:WandDeKai
 * @date:Created in 2019/8/20
 * @param:
 * @description: 懒汉模式
 * @version:1.0
 */
public class Singleton2 {
    //指向自己实例的私有静态引用
    private static Singleton2 singleton2;
    //私有的构造方法
    private Singleton2(){ };
    //以自己实例返回值的静态的共有方法,静态工厂方法
    public static Singleton2 getSingleton2(){
       if(singleton2==null){
           Singleton2 singleton2 = new Singleton2();
       }
        System.out.println();
        System.out.println(

        );
        return singleton2;

    }
}
