package com.sapient.appnomic;

public class Synch2 {
    public synchronized void m1() {
    }
    public synchronized void m2() {
        m1();
    }
    public static void main(String[] args) {
        Synch2 s = new Synch2();
        s.m2();
        System.out.println("Done");
    }
}
