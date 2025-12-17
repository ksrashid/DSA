package datastructures.stack;

public class Main {
  public static void main(String[] args) {

  // Testing initializer
    Stack myStack = new Stack(8);
    myStack.printStack();

  // Testing Pop
    System.out.println("Pop: " + myStack.pop().value);
    myStack.push(1);
    myStack.push(2);
    myStack.printStack();
  
  }
}
