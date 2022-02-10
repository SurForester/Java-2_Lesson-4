package com.geekbrains;

public class OwnLinkedList<T> {
    private long size;
    private Node head;
    private Node tail;

    public OwnLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void addNode(T data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
        }

        tail = newNode;
        size++;
    }

    public void addNode(T data, long index) {
        // проверка на входимость индекса в список
        if (index > (size - 1) || index < 0) {
            System.out.println("Index beyond the frontier of array");
            return;
        }
        Node newNode = new Node(data);
        // если это голова
        if (index == 0) {
            Node headNext = head;
            head = newNode;
            newNode.next = headNext;
            size++;
            return;
        }
        // вставка в тушку
        Node current = head;
        long counter = 0;

        while (current != null && counter < index) {
            current = current.next;
            counter++;
        }
        // встраиваем
        if (index == (size - 1)) {
            tail.next = newNode;
            tail = newNode;
        } else {
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    public void deleteNodeAtIndex(long index) {
        if (index > (size - 1) || index < 0) {
            System.out.println("Index beyond the frontier of array");
            return;
        }
        // если это голова
        if (index == 0) {
            Node deletedNode = head;
            head = head.next;
            deletedNode = null;
            size--;
            return;
        }
        Node current = head;
        long counter = 0;

        while (current != null && counter < (index - 1)) {
            current = current.next;
            counter++;
        }
        // удаляем
        Node deletedNode = current.next;
        if (index == (size - 1)) {
            tail = current;
            tail.next = null;
        } else {
            current.next = deletedNode.next;
        }
        deletedNode = null;
        size--;
    }

    public void display() {
        Node current = head;

        if (head == null) {
            System.out.println("Односвязный список пуст");
            return;
        }

        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public void display(int index) {
        if (index > size) {
            System.out.println("Размер списка больше чем заданный индекс");
            return;
        }

        Node current = head;

        for (int i = 1; i <= index; i++) {
            current = current.next;
        }

        System.out.println(current.data);
    }

    private class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
