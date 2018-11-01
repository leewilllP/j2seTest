package Collection;

import OOP.Hero;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayIterate {


    public static void main(String[] args) {
        List<Hero> list = new ArrayList<>();
        for(int i= 0;i<5;i++){
            list.add(new Hero("hero name"+i));
        }
        // 第一种遍历 for循环
        for (int i = 0; i<list.size();i++){
            Hero h = list.get(i);
            System.out.println(h);
        }
        //第二种 使用迭代器遍历
        System.out.println("----使用while的iterator---");
        Iterator<Hero> it = list.iterator();
        //从最开始的位置判断"下一个"位置是否有数据
        //如果有就通过next取出来，并且把指针向下移动
        //直到"下一个"位置没有数据
        while (it.hasNext()){
            Hero h = it.next();
            System.out.println(h);
        }
        System.out.println("----使用for的iterator---");
        for (Iterator<Hero> iterator = list.iterator();
                iterator.hasNext();){
            Hero hero = (Hero) iterator.next();
            System.out.println(hero);
        }
        System.out.println("---增强型for循环遍历---");
        for (Hero h: list
             ) {
            System.out.println(h);
            
        }

    }

}
