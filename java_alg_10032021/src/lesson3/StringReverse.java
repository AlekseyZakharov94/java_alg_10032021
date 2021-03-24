package lesson3;

public class StringReverse {

    public static void reverse(String str) {
        MyStack<Character> stack = new MyStack<>(str.length());
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
