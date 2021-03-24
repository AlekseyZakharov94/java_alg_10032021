package lesson3;


public class Main {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        for (int i = 0; i < 15; i++) {
            myStack.push("a" + i);
        }
//
//        myStack.push("asd");
//        myStack.push("bnm");
//        myStack.push("cdfg");
//        myStack.push("dffghfghfg");
//
//        for (int i = 0; i < 4; i++) {
//            System.out.println(myStack.pop());
//        }

//        Expression expression = new Expression("(( [7] + {-8*a} + t ])");
//        System.out.println(expression.checkBracket());

//        MyQueue<Integer> myQueue = new MyQueue<>();
//        for (int i = 0; i < 5; i++) {
//            myQueue.insert(i*10);
//        }
//        System.out.println(myQueue);
//
//        for (int i = 0; i < 5; i++) {
//            System.out.print(myQueue.remove());
//        }
//        System.out.println(myQueue);

        StringReverse.reverse("йескелА");

        MyDeQueue<Integer> myDeQueue1 = new MyDeQueue<>();
        MyDeQueue<Integer> myDeQueue2 = new MyDeQueue<>();
        for (int i = 0; i < 5; i++) {
            myDeQueue1.insertLeft(i*2);
            myDeQueue2.insertRight(i*2);
        }
        myDeQueue1.removeLeft();
        myDeQueue2.removeRight();
    }
}
