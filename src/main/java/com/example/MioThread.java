package com.example;

public class MioThread implements Runnable{
    private int n = 0;
    public MioThread(int p1){
        this.n = p1;
    }

    public void run(){
        for(int i = 0; i < this.n; i++){
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
