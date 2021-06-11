package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
    @Test
        public void givenThreeNumber_whenAddedToLinkedListShouldBeAddedToTheTop() {
            MyNode<Integer> myThirdNode = new MyNode<>(70);
            MyNode<Integer> mySecondNode = new MyNode<>(30);
            MyNode<Integer> myFirstNode = new MyNode<>(56);

            LinkedList<Integer> myLinkedList = new LinkedList<>();

            myLinkedList.add(myFirstNode);
            myLinkedList.add(mySecondNode);
            myLinkedList.add(myThirdNode);

            myLinkedList.printMyNodes();

            boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myFirstNode);
            Assert.assertTrue(result);
        }

        @Test
        public void given3NumbersWhenAddedToTheLinkedList_ShouldBeAddedToLast () {
            MyNode<Integer> myFirstNode = new MyNode<>(56);
            MyNode<Integer> mySecondNode= new MyNode<>(30);
            MyNode<Integer> myThirdNode = new MyNode<>(70);

            LinkedList<Integer> myLinkedList = new LinkedList<>();

            myLinkedList.add(myFirstNode);
            myLinkedList.append(mySecondNode);
            myLinkedList.append(myThirdNode);

            myLinkedList.printMyNodes();

                    boolean result = myLinkedList.head.equals(myFirstNode) &&
                    myLinkedList.head.getNext().equals(mySecondNode) &&
                    myLinkedList.tail.equals(myThirdNode);
                    Assert.assertTrue(result);
        }

    @Test
    public void  given3NumbersWhenInsertingSecondInBetween_ShouldPassLinkedList() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        LinkedList<Integer> myLinkedList = new LinkedList<>();

        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode, mySecondNode);

        myLinkedList.printMyNodes();

                boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
                Assert.assertTrue(result);
    }
}

