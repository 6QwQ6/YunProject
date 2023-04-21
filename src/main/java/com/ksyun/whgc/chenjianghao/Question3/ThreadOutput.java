package com.ksyun.whgc.chenjianghao.Question3;

import static java.lang.Thread.sleep;

public class ThreadOutput {
    static Object lock = new Object();
    static int i=1;
    public static void output()
    {

        new Thread(()->{
            Thread.currentThread().setName("A");
            for(int j=0;j<5;j++) {synchronized(lock)
            {
                while(true) {
                    if(i==1) {
                        i=2;
                        System.out.print(Thread.currentThread().getName());
                        lock.notifyAll();
                        break;
                    }
                    else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                }

            }}

        }).start();
        new Thread(()->{
            Thread.currentThread().setName("B");
            for(int j=0;j<5;j++) {synchronized(lock) {
                while(true) {
                    if(i==2) {
                        i=3;
                        System.out.print(Thread.currentThread().getName());
                        lock.notifyAll();
                        break;
                    }
                    else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                }}

            }
        }).start();
        new Thread(()->{
            Thread.currentThread().setName("C");
            for(int j=0;j<5;j++) {synchronized(lock) {
                while(true) {
                    if(i==3) {
                        i=1;
                        System.out.println(Thread.currentThread().getName()+"");
                        lock.notifyAll();
                        break;
                    }
                    else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                }
            }}


        }

        ).start();




    }
}

