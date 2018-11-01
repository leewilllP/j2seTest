package multiplethread;

import OOP.Hero;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
ArrayList是非线程安全的，换句话说，
多个线程可以同时进入一个ArrayList对象的add方法

借助Collections.synchronizedList，
可以把ArrayList转换为线程安全的List。

与此类似的，还有HashSet,LinkedList,HashMap
等等非线程安全的类，都通过工具类Collections转换为线程安全的
*/
public class synchronizedListTest {
    List<Object> list1 = new ArrayList<>();
    List<Object> list2 = Collections.synchronizedList(list1);
    //List<Object> list = Collections.synchronizedList(new ArrayList<>());

}
