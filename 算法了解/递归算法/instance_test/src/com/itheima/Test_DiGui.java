package com.itheima;

/**
 * @author:WandDeKai
 * @date:Created in 2019/8/17
 * @param: 递归算法
 * @description:
 * @version:1.0
 */
public class Test_DiGui {
    static void count(int n){
        if(n<=5){
            count(n+1);
            System.out.println("    "+n);
        }
    }

    public static void main(String[] args) {
        Test_DiGui.count(1);
        System.out.println();
    }
}
