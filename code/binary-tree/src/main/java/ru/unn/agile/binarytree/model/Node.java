package ru.unn.agile.binarytree.model;

class Node {
    private  int    key;
    private  String value;

    private  Node   rightChild;
    private  Node   leftChild;

    Node(final int key, final String value) {
        this.value = value;
        this.key = key;

        this.rightChild = null;
        this.leftChild  = null;
    }

    public void setRightChild(final Node childNode) {
        this.rightChild = childNode;
    }

    public void setLeftChild(final Node childNode) {
        this.leftChild = childNode;
    }

    int getKey() {
        return key;
    };

    void seValue(final String value) {
        this.value = value;
    }

    String getValue() {
        return value;
    }

    Node getRightChild() {
        return rightChild;
    }

    Node getLeftChild() {
        return leftChild;
    }

    int getHeight() {
        if (rightChild == null) {
            return 1;
        } else {
            return rightChild.getHeight() + 1;
        }
    }
}