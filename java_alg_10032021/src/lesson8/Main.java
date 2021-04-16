package lesson8;

import java.util.Random;

public class Main {
    static Random random;

    public static void main(String[] args) {
        ChainingHashMap<Integer, String> chm = new ChainingHashMap<>(7);
        chm.put(1, "a");
        chm.put(2, "b");
        chm.put(3, "c");
        chm.put(4, "d");
        chm.put(5, "e");
        chm.put(6, "v");
        chm.put(6,"r");
        System.out.println(chm);
        System.out.println(chm.get(6));
        System.out.println(chm.size());
        chm.delete(6);

        System.out.println(chm);
        System.out.println(chm.size());

    }
}
