package com.hongghe.patternexample.singleton;

/**
 * 饿汉式
 *
 * 这种方式在类加载时就完成了初始化，所以类加载较慢，
 * 但获取对象的速度快。 这种方式基于类加载机制避免了多线程的同步问题，
 * 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化instance显然没有达到懒加载的效果。
 *
 * @author hongghe 21/07/2018
 */
public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getHungrySingleton() {
        return hungrySingleton;
    }
}
