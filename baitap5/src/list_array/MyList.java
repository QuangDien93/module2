package list_array;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        elements = new Object[capacity];
    }
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(E e){
        if(size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }
    public void add(int index, E e){
        if(size == elements.length){
            this.ensureCapa();
        } else {
            for (int i = size; i >index ; i--) {
                elements[i] = elements[i-1];
            }
            elements[index] = e;
            size++;
        }
    }
    public E remove(int index){
        for (int i = index; i < size ; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return (E) elements;
    }
    public int getSize(){
        return this.size;
    }
    public E get(int i){
        if(i<0 || i>= size){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        } else {
            return (E) elements[i];
        }
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
