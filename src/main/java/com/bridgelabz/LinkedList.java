package com.bridgelabz;

public class LinkedList<E> {
    public INode<E> head;
    public INode<E> tail;

    public  void MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode<E> newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode<E> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void append(INode<E> myNode) {
        if (this.head == null) {
            this.head = myNode;
        }
        if (this.tail != null) {
            this.tail.setNext(myNode);
        }
        this.tail = myNode;
    }

    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("My Nodes are: ");
        System.out.println("Print statement");
        INode<E> tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }

        myNodes.append((tempNode.getKey()));
        System.out.println(myNodes);
    }
    public void insert(INode<E> myNode, INode<E> newNode) {
        INode<E> tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext((tempNode));
    }

}
