package com.geekbrains;

public class OwnLinkedListMain {
    public static void main(String[] args) {
        OwnLinkedList<Integer> integerOwnLinkedList = new OwnLinkedList<>();
        integerOwnLinkedList.addNode(150);
        integerOwnLinkedList.addNode(347);
        integerOwnLinkedList.addNode(111);
        integerOwnLinkedList.addNode(789);
        integerOwnLinkedList.addNode(222);
        integerOwnLinkedList.addNode(345);
        // добавим элемент списка после второго и отобразим добавленный
        System.out.println("Add element by index 2");
        integerOwnLinkedList.addNode(555, 1);
        System.out.println();
        // покажем весь список
        System.out.println("All list ...");
        integerOwnLinkedList.display();
        // удалим 5-й элемент
        System.out.println();
        System.out.println("Delete element at index 5");
        integerOwnLinkedList.deleteNodeAtIndex(5);
        integerOwnLinkedList.display();
        /*
        Integer[] arr = {150, 347, 111};
        System.out.println(arr[1]);
        */
    }
}
