package OOP;

import exception.custom;

public class Hero extends baba{
    public String name;
    public int id;
    public int damage;
    public float hp;
    //回血
    //直接在方法前加上修饰符synchronized
    //其所对应的同步对象，就是this
    //和hurt方法达到的效果一样
    public synchronized void recover(){
        hp=hp+1;
        if (hp ==120) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("%s 回血1点,增加血后，%s的血量是%.0f%n", name, name, hp);
        // 通知那些等待在this对象上的线程，可以醒过来了
        this.notify();
    }
    //掉血
    public void hurt(){
        synchronized (this){
            if (hp==1) {
                try {
                    // 让占有this的减血线程，暂时释放对this的占有，并等待
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            hp=hp-1;
            System.out.printf("%s 减血1点,减少血后，%s的血量是%.0f%n", name, name, hp);

        }
    }

    public void attackHero(Hero h) { //throws custom
        /*try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        h.hp -= damage;
        if (h.hp <= 0){
            h.hp = 0;
        }
        System.out.format("%s,正在攻击 %s,%s的血量变成了 %.0f%n",name,h.name,h.name,h.hp);
        if (h.isDead()){
            System.out.println(h.name+"死了！");
        }

        /*if (h.hp == 0)
            throw new custom(h.name+"已经死啦，不要放技能了");*/
    }
    public boolean isDead(){
        return 0>=hp? true:false;
    }
    void legendary(){
        System.out.println("legendary");
    }
    void recovery(float blood){
        hp = hp + blood;
    }
    float getHp(){
        return hp;
    }
    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "garen";
        garen.hp = 100;
        Hero teemo = new Hero();
        teemo.name = "teemo";
        teemo.hp = 0;
        try {
            garen.attackHero(teemo);
        } catch (Exception c) {
            c.printStackTrace();
            System.out.println("异常原因："+c.getMessage());

        }

        System.out.println(garen.name+"血量为:"+garen.hp);
        System.out.println("回血100");
        garen.recovery(100);
        System.out.println("当前"+garen.getHp());


    }public  Hero(){

    }
    public Hero(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }
}
