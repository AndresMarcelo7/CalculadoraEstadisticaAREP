package edu.escuelaing.arep.CalculadoraEstadistica.DataStructure;

import java.util.Iterator;

public class LinkedListIterator<E> implements Iterator<E>{
    Node<E> current;
    public LinkedListIterator(LinkedList<E> l)
    {
       this.current = l.getHead();
    }

    public E next() {
        E data = current.getData();
        this.current = current.getRight();
        return data;
    }

    public boolean hasNext() {
        return current  != null;
    }

    public void remove() {
        System.out.println("coño");
    }
}
