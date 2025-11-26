package datastructures.linkedlist;
public class LinkedList {
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
  public LinkedList(int Value) {
    Node newNode = new Node(Value);
    head = newNode;
    tail = newNode;
    length = 0; 
  }
  public void append(int Value) {
    Node temp = new Node(Value);
    if (length == 0) {
      head = temp;
      tail = temp;
    } else {
      tail.next = temp;
      tail = temp; 
    }
    length++;
  }
  
  public Node removeLast() {
    if (length == 0)
      return null;
    Node prev = head;
    Node curr = prev;
    while (curr.next != null) {
      prev = curr;
      curr = curr.next;
    }
    tail = prev;
    tail.next = null;
    length--;
    
    if (length == 0) {
      head = null;
      tail = null;
    }
    
    return curr;
  }

  
  public void prepend(int Value) {
    Node temp = head;
    head = new Node(Value);
    head.next = temp;
    length++;    
  }
  
  public boolean insert(int index, int value) {
    return false;
  }
  

  public void printList() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.value + " ");
      temp = temp.next;
    }
  }
  
  public void reverseList() {
    // head -> node -> node -> tail -> null
    // 1 2 3 4 5
    if (length > 1) {
      Node temp;
      Node first = head; // 1
      Node second = first.next;
      first.next = null;
      // 1 -> null
      // 2 -> 3 -> 4 -> 5 -> null
  

      // first = 1
      // sec = 2
      // sec.next starts at 3
      while (second.next != null) {
        temp = second.next;   // 3    // 4  // 5
        
        second.next = first;  // 1    // 2  // 3
        first = second;       // 2    // 3  // 4
        
        // 2 -> 1 -> null 

        second = temp;        // 3    // 4  // 5
        // 3 -> 4 -> 5 -> null 
      }
      second.next = first;

      temp = head;
      head = tail;
      tail = temp;
    }
   
  }
  
}
