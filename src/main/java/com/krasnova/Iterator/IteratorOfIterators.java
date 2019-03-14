package com.krasnova.Iterator;

import java.util.Iterator;

public class IteratorOfIterators <T extends Number, I extends Iterator<T>> implements Iterator{

    private final I[] iterators;
    private int index = 0;

    public IteratorOfIterators(I[] iterators) {
        this.iterators = iterators;
    }

    public boolean hasNext() {
        return iterators[index].hasNext() || notDetectedLastIterator();
    }

    private boolean notDetectedLastIterator(){
        return (index + 1 < iterators.length);
    }

    public T next() {
        if (iterators[index].hasNext()){
            return iterators[index].next();
        } else {
            return iterators[++index].next();
        }
    }

    public void remove() {

    }
}


class SimpleIterator<T extends Number> implements Iterator {

    private T[] values;
    private int index = 0;

    SimpleIterator(final T[] values) {
        this.values = values;
    }

    public boolean hasNext() {
        return index < values.length;
    }

    public T next() {
        return values[index++];
    }

    public void remove() {

    }
}

class Client {
    public static void main(String[] args) {
        SimpleIterator<Integer> i1 = new SimpleIterator<Integer>(new Integer[]{1,2,3});
        SimpleIterator<Integer> i2 = new SimpleIterator<Integer>(new Integer[]{1,2,3,4});

        IteratorOfIterators <Integer, Iterator<Integer>> iI = new IteratorOfIterators<Integer, Iterator<Integer>>
                (new SimpleIterator[]{i1,i2});

        while (iI.hasNext()){
            Integer i = iI.next();
            System.out.println(i);
        }

    }
}
