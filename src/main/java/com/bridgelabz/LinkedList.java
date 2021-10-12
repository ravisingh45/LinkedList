package com.bridgelabz;

public class LinkedList<T> {
    Node<T> head;
    public void add(T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;
        if (head == null) {
            head = newNode;
        }
        else {
            Node<T> node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
    }

    public void addAtStart(T data) {
        Node<T> node = new Node<>();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void show() {
        Node<T> node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
            ;
        }
        System.out.print(node.data);
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(56);
        list.addAtStart(30);
        list.addAtStart(70);
        list.show();
    }
}