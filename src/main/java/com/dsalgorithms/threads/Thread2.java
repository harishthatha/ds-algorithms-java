package com.dsalgorithms.threads;

public class Thread2 implements Runnable {

    public static void main(String[] args) {
        new Thread(new Thread2()).start();
        ;
        new Thread(new Thread2()).start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }


}
