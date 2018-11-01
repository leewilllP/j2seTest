package multiplethread;

import OOP.Hero;

public class ThreadInteraction {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.name = "oneone";
        hero.hp = 100;

        Thread t1 = new Thread(()->{
            while (true){
                try {
                    //加血
                    hero.recover();
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        t1.start();

        Thread t2 = new Thread(()->{
            while (true){
                //减血
                hero.hurt();
                if (hero.hp==1)
                    hero.recover();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t2.start();


























    }
}
