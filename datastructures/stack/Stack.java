package datastructures.stack;

public class Stack {

  private Node top;
  private int length;

  class Node {
    int value;
    Node next;

    Node(int value) {
      this.value = value;
    }
  }

  public Stack(int value) {
    Node newNode = new Node(value);
    top = newNode;
    length = 1;
  }

  public void push(int value) {
    Node newNode = new Node(value);
    if (length == 0) {
      top = newNode;
    } else {
      newNode.next = top;
      top = newNode;
    }
    length++;
  }
  public Node pop() {
    if (length == 0)
      return null;
    
    Node temp = top;
    temp.next = null;
    top = top.next;
    length--;

    return temp;
  }


  public void printStack() {
    Node temp = top;
    while (temp != null) {
      System.out.println(temp.value);
      temp = temp.next;
    }
  }

  
}
