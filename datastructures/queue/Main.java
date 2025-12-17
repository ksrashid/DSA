package datastructures.queue;

public class Main {
  public static void main(String[] args) {
    Queue myQueue = new Queue(0);
    myQueue.print();

    myQueue.enqueue(1);
    myQueue.enqueue(2);
    myQueue.enqueue(3);
    
    myQueue.print();

    myQueue.dequeue();
    myQueue.print();    
  }
}
