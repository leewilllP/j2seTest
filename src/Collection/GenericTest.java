package Collection;

import OOP.Hero;
import OOP.Item;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
       //对于不使用泛型的容器，可以往里面放英雄，也可以往里面放物品
        List heros = new ArrayList();
        heros.add(new Hero("傻哔"));
       //本来可以用来存放英雄的容器，现在也可以存放物品了
        heros.add(new Item("冰杖"));

        //对象转型会出现问题
        Hero h1 = (Hero) heros.get(0);
        //尤其是在容器里放的对象太多的时候，就记不清哪个位置放的是哪种类型的对象了
        //Hero h2 = (Hero) heros.get(1);

        //引入泛型Generic
        //声明容器的时候，就指定了这种容器，只能放Hero,放其他就会出错
        List<Hero> genericheros = new ArrayList<>();
        //List<Hero> genericheros = new ArrayList<Hero>();
        genericheros.add(new Hero("盖伦"));

        //除此之外，还能存放Hero的子类
        //并且在取出数据的时候，不再需要再进行转型了，因为里面肯定是放的Hero或者其子类
        Hero h = genericheros.get(0);
        System.out.println(h);

    }
}
