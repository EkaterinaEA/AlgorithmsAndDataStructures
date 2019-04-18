package com.krasnova.LinkedList;

public interface Linked<E> {
    void addFirst(E e);
    void addLast(E e);
    int size();
    E getElementByIndex(int counter);
}
