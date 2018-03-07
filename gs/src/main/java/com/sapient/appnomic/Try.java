package com.sapient.appnomic;

class A {
    public A() {
        System.out.print("A");
    }
}

class B extends A {
    public B() {
        //System.out.print("B");
        super();
    }
}

public class Try {
    public static void main(String[] args) {
        new B();
    }
}