package edu.escuelaing.arep.CalculadoraEstadistica.DataStructure;

public class Node<E> {
    private Node<E> Right;
    private E data;

    public Node(E data) {
        this.data = data;
    }
    public Node<E> getRight() {
        return Right;
    }
    public void setRight(Node<E> right) {
        Right = right;
    }
    public E getData() {
        return data;
    }
    public void setData(E data) {
        this.data = data;
    }
}
