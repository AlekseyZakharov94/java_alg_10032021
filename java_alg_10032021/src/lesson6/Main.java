package lesson6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        MyTreeMap<Integer, String> map = new MyTreeMap<>();
//
//        map.put(1, "one");
//        map.put(2, "two");
//        map.put(5, "five");
//        map.put(4, "four");
//        map.put(3, "three");

//        System.out.println(map.minKey());
//        System.out.println(map.maxKey());

//        System.out.println(map.get(3));
//        map.put(3, "tttrrreee");
//        System.out.println(map.get(3));
//
//        map.deleteMin();
//
//        map.delele(4);
//        System.out.println(map.get(4));
//
//        System.out.println(map);
        Random rnd = new Random();
        int treeCount = 200000;
        int balancedTreesCount = 0;
        for (int i = 0; i < treeCount; i++) {
            MyTreeMap<Integer, Integer> myTreeMap = new MyTreeMap<>();
            for (int j = 0; j < 6; j++) {
                myTreeMap.put(rnd.nextInt(100) - 99, rnd.nextInt(100) - 99);
            }
            if (myTreeMap.isBalanced()){
                balancedTreesCount++;
            }
        }
        System.out.println("percentage ratio of balanced trees is: " + (double)balancedTreesCount/treeCount*100 + "%");
    }
}
