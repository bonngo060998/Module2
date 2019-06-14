package arraylist;

import java.util.Iterator;

public class MyArrayList<E> extends MyAbstractList {
    public static final int INITIAL_CAPACITY = 16;
    private E[] data = (E[]) new Object[INITIAL_CAPACITY];

    public MyArrayList() {
    }

    private void ensureCapacity() {
        if (size >= data.length) {
            E[] newData = (E[]) (new Object[size * 2 + 1]);
            System.arraycopy (data, 0, newData, 0, size);
            data = newData;
        }
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void add(int index, Object o) {

    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object o) {
        return null;
    }
}