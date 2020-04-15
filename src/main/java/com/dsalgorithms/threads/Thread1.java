package com.dsalgorithms.threads;

public class Thread1 extends Thread {

    public static void main(String[] args) {
        new Thread1().start();
        ;
        new Thread1().start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread " + i);
            /*
             * try { //Thread.sleep(100); } catch (InterruptedException e) { // TODO
             * Auto-generated catch block e.printStackTrace(); }
             */
        }
        ;
    }


}
