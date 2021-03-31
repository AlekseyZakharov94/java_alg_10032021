package lesson4;

import java.util.NoSuchElementException;

public class MyLinkedQueue<T> {
    public MyLinkedList<T> ll = new MyLinkedList<>();

    public void insert(T item) {
        ll.insertLast(item);
    }

    public T peekFront() {
        return ll.getFirst();
    }

    public T remove() {
        return ll.removeFirst();
    }

    public int size(){
        return ll.size();
    }

    public boolean isEmpty(){
        return ll.isEmpty();
    }
}
