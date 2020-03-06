package epam.collectionFramework;

import java.util.Arrays;

public class Collection <C>{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object e[]; 
    public Collection() {
        e = new Object[DEFAULT_CAPACITY];
    }
    public void add(C c) {
        if (size == e.length) {
            checkCapacity();
        }
        e[size++] = c;
    }
    @SuppressWarnings("unchecked")
    public C get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (C) e[i];
    }
    @SuppressWarnings("unchecked")
    public C remove(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = e[i];
        int numE = e.length - ( i + 1 ) ;
        System.arraycopy( e, i + 1, e, i, numE ) ;
        size--;
        return (C) item;
    }
    public int size() {
        return size;
    }
    public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < size ;i++) {
             sb.append(e[i].toString());
             if(i<size-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }    
    private void checkCapacity() {
        int newSize = e.length * 2;
        e = Arrays.copyOf(e, newSize);
    }
}
