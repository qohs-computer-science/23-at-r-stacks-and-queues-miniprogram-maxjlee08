import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class StackQueueMini {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Stack<Integer> stack = new Stack<>();
    Queue<Integer> queue = new LinkedList<>();

    for(int i = 0; i < 5; i++) {
      System.out.print("Enter a number: ");
      stack.push(input.nextInt());
    }
    
    System.out.println("Original Stack Bottom "+ stack + " Top");

    Stack<Integer> tempStack = new Stack<>();

    while(!stack.isEmpty()) {
      tempStack.push(stack.pop());
    } 

    while(!tempStack.isEmpty()) {
      int value = tempStack.pop();
      stack.push(value);
      stack.push(value);
    }

    System.out.println("Modified Stack Bottom "+ stack + " Top");

    for(int i = 0; i<10; i++){
      System.out.print("Enter a number: ");
      queue.add(input.nextInt());
    }
    input.close();

    System.out.println("Original Queue Front " + queue + " back");

    Queue<Integer> tempQueue = new LinkedList<>();
    int size = queue.size();
    for(int i = 0; i < size; i++) 
      {
        int value = queue.remove();
      if(value % 2 == 0) {
        queue.add(value);
      } else {
        tempQueue.add(value);
      }
    }
      while(!tempQueue.isEmpty()) {
        queue.add(tempQueue.remove());
      }
    
      System.out.println("Modified Queue Front " + queue + " back");
  }

}