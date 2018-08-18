package com.hongghe.patternexample.nochange;

/**
 * 在Java语言中，不变模式的实现很简单，只需要注意一下4点：
 * a. 去除所有setter方法以及可以修改自身属性的方法；
 * b. 将所有属性设置为private的，并用final标记，确保其不可修改；
 * c. 确保没有子类可以继承该类；
 * d. 有一个可以创建完整对象的构造函数。
 * 下面利用Java代码实现了满足上面4点的不变模式的类
 *
 * @author hongghe 2018/8/18
 */
public final class Product { //final可以确保不会被继承
    private final String a;  //private确保不可被访问，final确保不可被修改
    private final String b;
    private final double c;

    public Product(String a, String b, double c) {
        //创建对象时必须指定值，因为创建后将无法修改
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}