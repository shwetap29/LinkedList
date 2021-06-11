package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
    @Test
    public void GivenThreeNumbers_WhenAddedToLinkedList_ShouldBeAddedtoTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        boolean result = (myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.tail.equals(myFirstNode));
        Assert.assertEquals(true, result);
    }

    //Created Simple Linked List and Added to The Last position
    @Test
    public void GivenThreeNumbers_WhenAddedToLinkedList_ShouldAddedtoBottom() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        boolean result = (myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.tail.equals(myThirdNode));
        Assert.assertEquals(true, result);
    }

    // Insert  A element Between 2 nodes
    @Test
    public void GivenANodeInsertedInBetweenResultingNodes_ShouldReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        LinkedList<Integer> LinkedList = new LinkedList<Integer>();
        LinkedList.append(myFirstNode);
        LinkedList.append(myThirdNode);
        LinkedList.insertNode(myFirstNode, mySecondNode);
        boolean result = (LinkedList.head.equals(myFirstNode) && LinkedList.head.getNext().equals(mySecondNode)
                && LinkedList.tail.equals(myThirdNode));
        Assert.assertEquals(true, result);
    }

    // Remove First Node
    @Test
    public void PopNodeFromFront_ShouldReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        LinkedList<Integer> LinkedList = new LinkedList<Integer>();
        LinkedList.add(myFirstNode);
        LinkedList.add(mySecondNode);
        LinkedList.add(myThirdNode);
        INode<Integer> deletedNode = LinkedList.popFirst();
        Assert.assertEquals(deletedNode, myThirdNode);
    }

    //Removed Last Node
    @Test
    public void PopNodeFromLast_ShouldReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        LinkedList<Integer> LinkedList = new LinkedList<Integer>();
        LinkedList.add(myFirstNode);
        LinkedList.add(mySecondNode);
        LinkedList.add(myThirdNode);
        INode<Integer> deletedNode = LinkedList.popLast();
        Assert.assertEquals(deletedNode, myFirstNode);
    }

    //Search Node With A given Element
    @Test
    public void SearchNodeForGivenDataIfFound_ShouldReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        LinkedList<Integer> LinkedList = new LinkedList<Integer>();
        LinkedList.add(myFirstNode);
        LinkedList.add(mySecondNode);
        LinkedList.add(myThirdNode);
        INode searchNode = LinkedList.searchNode(30);
        Assert.assertEquals(searchNode, mySecondNode);
    }

    //Search datanode and insert
    @Test
    public void SearchDataNodeForGivenDataIfFound_ShouldInsertGivenNodeAndReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyNode<Integer> myFourthNode = new MyNode<>(40);
        LinkedList<Integer> LinkedList = new LinkedList<Integer>();
        LinkedList.add(myFirstNode);
        LinkedList.add(mySecondNode);
        LinkedList.add(myThirdNode);
        INode searchNode = LinkedList.searchNode(30);
        LinkedList.insertNode(searchNode, myFourthNode);
        boolean result = (LinkedList.head.equals(myThirdNode) && LinkedList.head.getNext().equals(searchNode)
                && LinkedList.head.getNext().getNext().equals(myFourthNode)
                && LinkedList.tail.equals(myFirstNode));
        Assert.assertEquals(true, result);
    }

    //Search datanode and delete
    @Test
    public void DeleteNodeFromLinkedlistIfDeletedShouldReturnSizeAndReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(40);
        MyNode<Integer> myThirdNode = new MyNode<>(30);
        MyNode<Integer> myFourthNode = new MyNode<>(56);
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.add(myFourthNode);
        myLinkedList.popNode(40);
        int size = myLinkedList.getSize();
        Assert.assertEquals(3, size);
    }
}

