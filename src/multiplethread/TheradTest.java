package multiplethread;

import OOP.Hero;
import exception.custom;

public class TheradTest {
    public static void main(String[] args) throws custom {
        Hero shagou = new Hero();
        shagou.name = "傻狗";
        shagou.hp = 5000;
        shagou.damage = 1;

        Hero ruizhi = new Hero();
        ruizhi.name = "睿智";
        ruizhi.hp = 10000;
        ruizhi.damage = 1;


        Thread t = new Thread(() -> {
            while (!ruizhi.isDead()){
                shagou.attackHero(ruizhi);
            }
        });

        /*try {
            *//*
            * join()方法  加入主线程 先执行再往下走
            *
            *
            * *//*
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        Thread t2 = new Thread(() ->{
            while (!shagou.isDead()){
                //Thread.yield();
                /*
                * 临时暂停，使t可以占用CPU
                * */
                ruizhi.attackHero(shagou);
            }
        });
        /*
        * 线程优先级
        * */
        /*t.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);*/
        t.start();
        /*try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        t2.start();

        /*Battle battle = new Battle(ruizhi,shagou);
        new Thread(battle).start();

        Battle battle1 = new Battle(shagou,ruizhi);
        new Thread(battle1).start();*/

        /*KillThread killThread = new KillThread(ruizhi,shagou);
        killThread.start();
        KillThread killThread1 = new KillThread(shagou,ruizhi);
        killThread1.start();*/


    }
}
