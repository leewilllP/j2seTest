package multiplethread;

import OOP.Hero;

/*
 * 同步
 * */
public class synchronizedTest {
    public static void main(String[] args) {
        final Hero temor = new Hero();
        temor.name = "提莫";
        temor.hp = 10000;
        System.out.printf(temor.name+"的初始血量是%.0f%n",temor.hp);
        //Object someObject = new Object();
        //多线程同步问题指的是多个线程同时修改一个数据的时候，导致的问题

        //假设提莫有10000滴血，并且在基地里，同时又被对方多个英雄攻击

        //用JAVA代码来表示，就是有多个线程在减少提莫的hp
        //同时又有多个线程在恢复提莫的hp
        int n = 10000;
        Thread[] addThreads = new Thread[n];
        Thread[] reduceThreads = new Thread[n];
        //n个线程增加提莫的hp
        for (int i = 0;i < n; i++){
            Thread t = new Thread(()->{
                //使用gareen作为synchronized
                /*synchronized (temor){
                temor.recover();
                }*/
                temor.recover();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });t.start();
            addThreads[i] = t;
        }
        //n个线程减少提莫的hp
        for (int i =0;i<n;i++){
            Thread t = new Thread(()->{
                /*synchronized (someObject) {
                    temor.hurt();
                }*/
                //使用gareen作为synchronized
                //在方法hurt中有synchronized(this)
                temor.hurt();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            t.start();
            reduceThreads[i] = t;
        }
        //等待所有增加线程结束后
        for (Thread t :addThreads){
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //等待所有减少线程结束后
        for (Thread t: reduceThreads){
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("%d个增加线程和%d个减少线程结束后%n提莫的血量变成了 %.0f%n", n,n,temor.hp);
    }
}
