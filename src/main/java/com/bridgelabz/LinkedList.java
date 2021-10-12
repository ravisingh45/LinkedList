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
    public void addAtIndex(int index, T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;

        if (index == 0) {
            addAtStart(data);
        } else {
            Node<T> node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            newNode.next = node.next;
            node.next = newNode;
        }
    }
    public void deleteFirst (){
        if (head != null) {
            Node<T> Head = head.next;

            head=Head;
        }
    }
    public void deleteLast() {
        Node<T> node = head;
        Node<T> PreviousNode = head;
        while (node.next != null) {
            PreviousNode = node;
            node = node.next;
        }
        PreviousNode.next = null;
    }
    public Node<T> searchOperation (T data ) {
        Node<T> node = new Node<>();
        node=head;

        while(node.data != data) {
            node=node.next;
            System.out.println("Element Found : " +data);
            break;
        }
        return node;

    }
    public void findNodeAddData(T data, T AddedData) {
        Node<T> node = searchOperation(data);
        Node<T> newNode = new Node<T>();
        newNode=head;
        int count=1;
        while(node != newNode) {
            newNode=newNode.next;
            count++;
        }
        addAtIndex(count, AddedData);
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
        list.addAtIndex(0,56);
        list.addAtIndex(1,30);
        list.add(70);
        list.findNodeAddData(30,40);
        list.show();
    }
}