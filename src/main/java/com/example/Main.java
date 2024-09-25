package com.example;

public class Main {
    public static void main(String[] args) {
        int l = 200;

        MioThread t1 = new MioThread(l);
        MioThread t2 = new MioThread(l);
        new Thread(t1).start();
        new Thread(t2).start();

        System.out.println("Hello World!");
    }
}