package com.itcast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author:WandDeKai
 * @date:Created in 2019/8/17
 * @param:
 * @description:
 * @version:1.0
 */
public class Test01 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>();
        collection.add("小三");
        collection.add("小四");
        collection.add("小五");
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
    }
}
