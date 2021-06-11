package com.bridgelabz;

public class LinkedList<T> {
    public INode<T> head;
    public INode<T> tail;

    public  void MyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    // Add First
    public void addFirst(INode<T> newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (head == null) {
            head = newNode;
        } else {
            INode<T> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    // Add Last
    public void addLast(INode<T> newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        if(tail == null) {
            tail = newNode;
        } else {
            this.tail.setNext(newNode);
            tail = newNode;
        }
    }

    // Insert Node Between Nodes
    public void insertNode(INode<Integer> myFirstNode, INode<Integer> mySecondNode) {
        mySecondNode.setNext(myFirstNode.getNext());
        myFirstNode.setNext(mySecondNode);
    }

    // Delete/Pop First Node
    public INode<T> popFirst() {
        INode<T> tempNode = this.head;
        this.head = this.head.getNext();
        return tempNode;
    }

    // Delete/Pop Last Node //
    public INode<T> popLast() {
        INode<T> tempNode = head;
        while (!(tempNode.getNext().equals(tail))) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }

    // Search Node with given key
    public INode searchNode(T key) {
        INode tempNode = this.head;
        while (tempNode != null) {
            if (tempNode.getData() == key) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }
  // Delete 40
    public void popNode(T key) {
        INode tempNode = head;
        while (tempNode.getNext().getData() != key) {
            tempNode = tempNode.getNext();
        }
        tempNode.setNext(tempNode.getNext().getNext());
    }


    public int getSize() {
        int size = 0;
        INode tempNode = head;
        while (tempNode != null) {
            size++;
            tempNode = tempNode.getNext();
        }
        return size;
    }
}
