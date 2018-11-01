package Collection;

import OOP.Hero;

public class deadlockTest {
    public static void main(String[] args) {
        Hero ali = new Hero();
        ali.name = "阿狸";
        Hero annie = new Hero();
        annie.name = "安妮";
        Hero air = new Hero();
        air.name = "艾瑞丽娅";

        Thread thread = new Thread(()->{
            synchronized (ali){
                try {
                    System.out.println("t1已占有阿狸");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t1 试图占领安妮。。。");
                System.out.println("t1 等待中。。。");
                synchronized (annie){
                    System.out.println("嘎哈?");
                }
            }
        });
        thread.start();
        Thread t2 = new Thread(()->{
            synchronized (annie){
                try {
                    System.out.println("t2已占有安妮");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t2 试图占领艾瑞丽娅。。。");
                System.out.println("t2 等待中。。。");
                synchronized (air){
                    System.out.println("嘎哈鸭2?");
                }
            }
        });
        t2.start();

        Thread t3 = new Thread(()->{
            synchronized (air){
                try {
                    System.out.println("t3 已占有艾瑞丽娅");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t3 试图占领阿狸。。。");
                System.out.println("t3 等待中。。。");
                synchronized (ali){
                    System.out.println("嘎哈鸭3?");
                }
            }
        });
        t3.start();
    }
}
