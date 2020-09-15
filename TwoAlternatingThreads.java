package edu.neu.csye6200;


public class TwoAlternatingThreads implements Runnable{
    private static Object stop = new Object();


        public void MultiThreading(char a) throws InterruptedException {
            synchronized (stop) {
                for (int i = 0; i <= 25; i++) {
                    System.out.print((char)(a+i));
                    stop.notify();
                        stop.wait();
                }
            }
        }

    private Thread th1 = new Thread() {
        @Override
        public void run() {
            try {
                MultiThreading('a');
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    private Thread th2 = new Thread() {
        @Override
        public void run() {
            try {
                MultiThreading('A');
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };


    public static void demo() {
        TwoAlternatingThreads twoAlternatingThreads=new TwoAlternatingThreads();
        twoAlternatingThreads.run();
    }

    @Override
    public void run() {
        th1.start();
        th2.start();
    }
}
