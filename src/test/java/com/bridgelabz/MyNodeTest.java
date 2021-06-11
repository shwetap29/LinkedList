package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {
    @Test
    public void givenCallShouldPrintWelcomeMessage() {
        MyNode myFirstNode = new MyNode();
        myFirstNode.printWelcomeMessage();
    }
//Created Simple list
    @Test
    public void GivenThreeNumbersWhenLinked_ShouldPassLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        LinkedList LinkedList = new LinkedList();
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = (myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode));
        Assert.assertTrue(result);
    }
}
