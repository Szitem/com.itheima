package com.itheima;

/**
 * @author:WandDeKai
 * @date:Created in 2019/8/17
 * @param:
 * @description:
 * @version:1.0
 */
public class Test {

    public static void main(String[] args) {
        new Test().plint(WDKsBaby.WANG_XIAO_GUANG);
    }

    public void plint(WDKsBaby wdKsBaby) {
        String name = wdKsBaby.getName();
        System.out.println(name);
    }
}
