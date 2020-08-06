package edu.escuelaing.arep.CalculadoraEstadistica.DataStructure;

import java.math.BigDecimal;

public class Node {
    private Node left;
    private Node Right;
    private BigDecimal data;
    public void Node(BigDecimal data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return Right;
    }

    public void setRight(Node right) {
        Right = right;
    }

    public BigDecimal getData() {
        return data;
    }

    public void setData(BigDecimal data) {
        this.data = data;
    }
}
