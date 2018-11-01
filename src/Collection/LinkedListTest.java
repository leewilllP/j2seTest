package Collection;

import OOP.Hero;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Hero> list = new LinkedList<Hero>();
        list.addLast(new Hero("啦啦"));
        list.addLast(new Hero("啦啦2"));
        list.addLast(new Hero("啦啦3"));
        System.out.println(list);

        list.addFirst(new Hero("啦"));
        System.out.println(list);
        //查看最前面的英雄
        System.out.println(list.getFirst());
        //查看最后面的英雄
        System.out.println(list.getLast());

        //查看不会导致英雄被删除
        System.out.println(list);
        //取出最前面的英雄
        System.out.println(list.removeFirst());
        //取出最后面的英雄
        System.out.println(list.removeLast());
        //取出回导致英雄被删除
        System.out.println(list);








    }
}
