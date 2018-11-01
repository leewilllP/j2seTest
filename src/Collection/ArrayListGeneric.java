package Collection;

import OOP.Hero;
import OOP.Item;
import OOP.baba;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGeneric {
    public static void main(String[] args) {
        List<baba> arraylistgeneric = new ArrayList<>();
        arraylistgeneric.add(new Hero("1a"));
        arraylistgeneric.add(new Item("没有用"));
        Item it = (Item) arraylistgeneric.get(1);

        System.out.print(arraylistgeneric.get(1));
        it.effect();

    }

}
