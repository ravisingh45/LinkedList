package com.bridgelabz;

  public class LinkedListed {
    class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
    public Node head = null;
    public Node tail = null;

    public void addNode(int data){
    Node node = new Node(data);
    if(head == null){
        head = node;
        tail = node;
    }
    else {
        tail.next = node;
        tail = node;
     }
    }
    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("list is empty");
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
  }


