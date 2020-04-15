package com.dsalgorithms.threads;

public class Thread3 {


    public static void main(String[] main) {
        new Thread(() -> {
            for (int i = 0; i < 10; i++) System.out.println("Thread name : " + Thread.currentThread().getName());
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) System.out.println("Thread name : " + Thread.currentThread().getName());
        }).start();
    }
}
