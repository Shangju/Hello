package com.FirstDay.duoTai;

public class PrivateOverride {
    private void f(){
        System.out.println("private");
    }

    public static void main(String[] args) {
        PrivateOverride privateOverride = new Derived();
        privateOverride.f();//私有方法无法多态
        ((Derived) privateOverride).f();
    }
}

class Derived extends PrivateOverride{
    public void f(){
        System.out.println("public");
    }
}
