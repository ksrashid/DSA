package datastructures.linkedlist;
public class LinkedList {
  private Node head;
  private Node tail;
  private int length;

/*
 append
 prepend
 insert
 removelast
 removefirst
 get
 printList
 reverse list 
*/
    
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
    length = 1; 
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
  
  public void prepend(int Value) {
    Node temp = head;
    if (head == null) {
      head = temp;
      tail = temp; 
    } else {
    head = new Node(Value);
    head.next = temp;
      
    }
    length++;    
  }

  // insert node at given index;
  public boolean insert(int idx, int value) {
    if (idx < 0 || idx >length)
      return false;

      if (idx == 0) {
        prepend(value);
      } else if (idx == length) {
          append(value);
      } else {
        Node newInsert = new Node(value);
        int i = 0;
        Node temp = get(idx -1);
        newInsert.next = temp.next;
        temp.next = newInsert;
      }
    return true;
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

  public Node removeFirst() {
    if (length == 0)
      return null;

    Node first = head;
    head = head.next;
    first.next = null;
    length--;
        
    if (length == 0) {
      tail = null;
    }
    return first;
  }
  public Node get(int idx) {
    if (idx > length || idx < 0)
      return null;
    Node temp = head;
    int i = 0;
    while (i < idx) {
      temp = temp.next;
      i++;
    }
    return temp;
  }

  public boolean set(int idx, int value) {
    Node temp = get(idx);
    if (temp == null)
      return false;
      
    temp.value = value;
    
    return true;
  }
  
  public void printList() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.value + " ");
      temp = temp.next;
    }
  }

  public int getLen() {
    return length;
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
