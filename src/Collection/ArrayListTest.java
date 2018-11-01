package Collection;

import OOP.Hero;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {

        List heros = new ArrayList();
        heros.add(new Hero("盖伦"));
        System.out.println(heros.size());
    }
}
