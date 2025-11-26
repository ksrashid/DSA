package datastructures.linkedlist;

public class Main {
  public static void main(String[] args) {
    LinkedList myLinkedList = new LinkedList(0);
    // myLinkedList.printList();
    // myLinkedList.prepend(4);
    int i = 1;
    while (i < 10) {
      myLinkedList.append(i);
      i++;
    }
    // System.out.println();
    // myLinkedList.printList();

    // System.out.println("last item in list: " + myLinkedList.removeLast().value);
    myLinkedList.printList();
    System.out.println();
    myLinkedList.reverseList();
    myLinkedList.printList();
  }

}
