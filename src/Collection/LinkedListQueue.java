package Collection;

import OOP.Hero;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {
        //Queue是先进先出队列FIFO
        /*
        * offer 在最后添加元素
          poll 取出第一个元素
          peek 查看第一个元素
        * */
        List list = new LinkedList();
        //所不同是的LinkedList害实现了Deque，进而又实现了Queue这个接口
        //Queue代表FIFO 先进先出队列
        Queue<Hero> q = new LinkedList<>();

        //加在队列的最后面
        System.out.println("初始化队列:\t");
        q.offer(new Hero("啦啦1"));
        q.offer(new Hero("啦啦2"));
        q.offer(new Hero("啦啦3"));
        q.offer(new Hero("啦啦4"));
        System.out.println(q);
        System.out.println("把第一个元素取poll()出来:\t");

        //取出第一个Hero,FIFO 先进先出
        Hero h = q.poll();
        System.out.println(h);
        System.out.println("取出第一个元素之后的队列:\t");
        System.out.println(q);
        System.out.println("把第二个元素取poll()出来:\t");
        Hero h2 = q.poll();
        System.out.println(h2);

        //把第一个拿出来看一看，但是不取出来
        h = q.peek();
        System.out.println("查看peek()第一个元素:\t");
        System.out.println(h);
        System.out.println(q);
        h2 = q.peek();
        System.out.println(h2);











    }
}
