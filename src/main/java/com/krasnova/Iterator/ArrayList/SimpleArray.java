package com.krasnova.Iterator.ArrayList;

import java.util.Iterator;

public class SimpleArray<E> implements Simple<E> {

    private E[] values;

    public SimpleArray() {
        values = (E[]) new Object[0];
    }

    public boolean add(E e) {

        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException ex){
            ex.printStackTrace();
        } return false;
    }

    public void delete(int index) {

        try {
            E[] temp = values;
            int amountElemAfterIndex = temp.length - index - 1;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            System.arraycopy(temp, index + 1, values, index, amountElemAfterIndex);
        } catch (ClassCastException ex){
            ex.printStackTrace();
        }
    }

    public E get(int index) {
        return values[index];
    }

    public int size() {
        return values.length;
    }

    public void update(int index, E e) {
        values[index] = e;
    }

    public Iterator<E> iterator() {
        return new ArrayIterator<E>(values);
    }

    public static void main(String[] args) {

        Simple<String> strings = new SimpleArray<String>();

        strings.add("first");
        strings.add("second");
        strings.add("third");

        System.out.println(strings.get(1));
        System.out.println(strings.size());

        strings.update(1, "update");

        System.out.println(strings.get(1));
        System.out.println(strings.size());

        strings.delete(1);
        System.out.println(strings.get(1));
        System.out.println(strings.size());

        for (String s : strings){
            System.out.println(s);
        }

    }

}
