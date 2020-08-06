package edu.escuelaing.arep.CalculadoraEstadistica.DataStructure;

import java.util.AbstractCollection;
import java.util.Iterator;

public class LinkedList<E> extends AbstractCollection<E> {
    Node<E> head;
    Node<E> tail;
    private int size=0;

    public boolean add(E data) {
        Node<E> node = new Node<E>(data);
        if (head==null){
            head = tail = node;
        }
        else{
            tail.setRight(node);
            tail = node;
        }
        size+=1;
        return true;
    }

    public boolean remove() {
        
        size-=1;
        return true;
    }



    public Node<E> getHead() {
        return head;
    }

    public void setHead(Node<E> head) {
        this.head = head;
    }

    public Node<E> getTail() {
        return tail;
    }

    public void setTail(Node<E> tail) {
        this.tail = tail;
    }

    public Iterator iterator() {
        return new LinkedListIterator<E>(this);
    }

    public int size() {
        return size;
    }


}
