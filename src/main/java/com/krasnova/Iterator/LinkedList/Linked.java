package com.krasnova.Iterator.LinkedList;

public interface Linked<E> {
    void addFirst(E e);
    void addLast(E e);
    int size();
    E getElementByIndex(int counter);
}
