package Collection;

import JDBC.sql;
import OOP.Hero;

import java.util.ArrayList;

/*如果要存放多个对象，可以使用数组，但是数组有局限性
        比如 声明长度是10的数组
        不用的数组就浪费了
        超过10的个数，又放不下*/
public class collectionTest {
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();
        heros.add(new Hero("卡莎"));
        //size 用于获取ArrayList的大小
        System.out.println(heros.size());
        Hero timo = new Hero("提莫");
        heros.add(timo);
        System.out.println(heros.size());
        Hero sp = new Hero("傻哔");
        heros.add(2,sp);
        System.out.println(heros);
        ArrayList h = new ArrayList();
        for (int i = 0;i<5;i++) {
            h.add("hero"+i);
        }

        System.out.println(h);
        // 判断一个对象是否在容器中
        // 判断标准： 是否是同一个对象，而不是name是否相同
        System.out.println(heros.contains(new Hero("傻哔")));
        System.out.println(heros.contains(sp));

        //如果超出了范围，依然会报错
        System.out.println(heros.get(2));
        //System.out.println(heros.get(3));

        /*indexOf用于判断一个对象在ArrayList中所处的位置
        与contains一样，判断标准是对象是否相同，而非对象的name值是否相等*/
        System.out.println(heros.indexOf(timo));
        System.out.println(heros.indexOf(new Hero("阿卡丽")));

        //remove可以根据下标删除ArrayList的元素
        heros.remove(2);
        //也可以根据对象删除
        heros.remove(timo);
        System.out.println(heros);

        Hero sb = new Hero("戴安娜");
        heros.add(sb);
        System.out.println(heros);
        //set用于替换指定位置的元素
        heros.set(1,new Hero("卡特琳娜"));
        System.out.println(heros);
        System.out.println(h.size());

           


        for (int k = 0;k<5;k++){/*
        toArray可以把一个ArrayList对象转换为数组。
        需要注意的是，如果要转换为一个Hero数组，
        那么需要传递一个Hero数组类型的对象给toArray()，
        这样toArray方法才知道，你希望转换为哪种类型的数组，
        否则只能转换为Object数组
        */
            System.out.println(h.toArray()[k]);
        }
        Hero hr[] = (Hero[]) heros.toArray(new Hero[]{});
        System.out.println(hr);
        //使用clear清空
        h.clear();
        System.out.println(h);
        System.out.println(heros);

        /*Hero heros[] = new Hero[10];
        heros[0] = new Hero("卡莎");
        //
        //heros[20] = new Hero("提莫");*/


    }
}
