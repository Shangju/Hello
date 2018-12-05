package com.FirstDay.duoTai;

public class StaticSuper {
    public static String staticGet(){
        return "static";
    }

    public String dynamicGet(){
        return "dynamicGet";
    }
}


class StaticSub extends StaticSuper{
    public static String staticGet(){
        return "STATIC";
    }

    public String dynamicGet(){
        return "XXXXXX";
    }
}

class Main{
    public static void main(String[] args) {
        StaticSuper staticSub = new StaticSub();
        System.out.println(staticSub.staticGet());//静态方法无法多态
        System.out.println(staticSub.dynamicGet());//普通成员方法多态的实现
    }
}