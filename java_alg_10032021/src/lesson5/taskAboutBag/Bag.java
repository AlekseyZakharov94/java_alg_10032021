package lesson5.taskAboutBag;

import java.util.List;

public class Bag {
    private final int capacity;
    private List<Item> bagItems;

    public Bag(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void getBagItems() {
        for (int i = 0; i < bagItems.size(); i++) {
            System.out.println(bagItems.get(i));
        }
    }

    public void add(List<Item> itemsToAdd) {
// не пошло и не успел(((
    }
}
