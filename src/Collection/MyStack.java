package Collection;
/*
* 与FIFO(先入先出的)队列类似的一种数据结构是FILO先入后出栈Stack
根据接口Stack ：
                实现类：MyStack
* */
import OOP.Hero;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MyStack implements Stack {
    public static  void main(String[] args) {

        MyStack ms = new MyStack();
        for (int i =1;i<=5;i++){
            ms.push(new Hero("Hero"+i));
        }
        System.out.println(ms.list);
        for (int i=1;i<=5;i++){
            Hero h = ms.pull();
            System.out.print(h+"\t");
        }
    }

    List<Hero> list = Collections.synchronizedList(new LinkedList<>());
    @Override
    public  void push(Hero h) {
        list.add(h);
    }

    @Override
    public  Hero pull() {
        return list.remove(list.size()-1);
    }

    @Override
    public Hero peek() {
        return list.get(list.size()-1);
    }
}
