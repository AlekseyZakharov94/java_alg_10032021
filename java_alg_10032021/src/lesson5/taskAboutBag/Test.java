package lesson5.taskAboutBag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Bag bag = new Bag(10);
        Random rnd = new Random();
        List<Item> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new Item(rnd.nextInt(10)+1, rnd.nextInt(100) ));
        }
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }
}
