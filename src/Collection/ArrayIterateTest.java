package Collection;

import OOP.Hero;

import java.util.ArrayList;
import java.util.List;

public class ArrayIterateTest {
    public static void main(String[] args) {
        List<Hero> list = new ArrayList<>();
        for (int i=0;i<100;i++){
            if (i%8!=0 || i==0)
                list.add(new Hero("hero "+i));
        }
        for (Hero h:list
             ) {
            System.out.println(h);
        }
    }
}
