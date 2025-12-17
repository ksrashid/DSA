package datastructures.queue;

public class Queue {
  private Node head;
  private Node tail;
  private int length;

  class Node {
    int value;
    Node next;

    Node(int value) {
      this.value = value;
    }
  }

  public Queue(int value) {
    Node newNode = new Node(value);
    head = newNode;
    tail = newNode;
    length = 1;  
  }

  public void enqueue(int value) {
    Node newNode = new Node(value);
    if (length == 0) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
    length++;
  }

  public Node dequeue() {
    if (length == 0)
      return null;

    Node temp = head;
    if (length == 1) {
      head = null;
      tail = null;
    } else {
      head = head.next;
      temp.next = null;
    }
    length--;
    return temp;
  }

  public void print() {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.value);
      temp = temp.next;
    }
  }
}
