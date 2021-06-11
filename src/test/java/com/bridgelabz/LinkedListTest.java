package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
    @Test
        public void givenThreeNumber_whenAddedToLinkedList_ShouldBeAddedToTheTop() {
            MyNode<Integer> myThirdNode = new MyNode<>(70);
            MyNode<Integer> mySecondNode = new MyNode<>(30);
            MyNode<Integer> myFirstNode = new MyNode<>(56);

            LinkedList<Integer> myLinkedList = new LinkedList<>();

            myLinkedList.add(myFirstNode);
            myLinkedList.add(mySecondNode);
            myLinkedList.add(myThirdNode);

            myLinkedList.printNodes();

                boolean result = myLinkedList.head.equals(myThirdNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myFirstNode);
                Assert.assertTrue(result);
    }

        @Test
        public void given3Numbers_WhenAddedToTheLinkedList_ShouldBeAddedToLast () {
            MyNode<Integer> myFirstNode = new MyNode<>(56);
            MyNode<Integer> mySecondNode= new MyNode<>(30);
            MyNode<Integer> myThirdNode = new MyNode<>(70);

            LinkedList<Integer> myLinkedList = new LinkedList<>();

            myLinkedList.add(myFirstNode);
            myLinkedList.append(mySecondNode);
            myLinkedList.append(myThirdNode);

            myLinkedList.printNodes();

                    boolean result = myLinkedList.head.equals(myFirstNode) &&
                    myLinkedList.head.getNext().equals(mySecondNode) &&
                    myLinkedList.tail.equals(myThirdNode);
                    Assert.assertTrue(result);
        }

    @Test
    public void  givenThreeNumbers_WhenInsertedSecondInBetween_ShouldPassLinkedList() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        LinkedList<Integer> myLinkedList = new LinkedList<>();

        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(1, mySecondNode);

        myLinkedList.printNodes();

                boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
                Assert.assertTrue(result);
    }

    @Test
    public void givenFirstElement_WhenDeleted_ShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        LinkedList<Integer> myLinkedList = new LinkedList<>();

        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.pop();

        myLinkedList.printNodes();

                boolean result = myLinkedList.head.equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
                 Assert.assertTrue(result);
    }

    @Test
    public void  givenLastElement_WhenDeleted_ShouldPassLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        LinkedList<Integer> myLinkedList = new LinkedList<>();

        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(1, mySecondNode);
        myLinkedList.popLast();
        myLinkedList.printNodes();

        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.tail.equals(mySecondNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenElementToSearchWhenMatched_ShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        LinkedList<Integer> myLinkedList = new LinkedList<>();

        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.search(mySecondNode);

        boolean result = myLinkedList.head.getNext().equals(mySecondNode);
        Assert.assertTrue(result);
    }

}

