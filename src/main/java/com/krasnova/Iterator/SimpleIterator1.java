package com.krasnova.Iterator;

import com.krasnova.Iterator.SimpleIterator;

import java.util.Iterator;

public class SimpleIterator1<T> implements Iterator<T> {

    private T[] objects;
    private int index = 0;

    public SimpleIterator1(T[] objects) {
        this.objects = objects;
    }

    public boolean hasNext() {
        return index < objects.length;
    }

    public T next() {
        return objects[index++];
    }

    public void remove() {

    }

    public static void main(String[] args) {

        Integer[] integers = new Integer[3];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;

        SimpleIterator<Integer> s = new SimpleIterator<Integer>(integers);

        while (s.hasNext()){
            Integer i = s.next();
            System.out.println(i);
        }

    }

}
