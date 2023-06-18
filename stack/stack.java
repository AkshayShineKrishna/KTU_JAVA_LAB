package stack;
import java.util.Scanner;

class Stack {
    int top = -1;
    int[] stack;
    int size, item;

    // Constructor to initialize the stack with given size
    Stack(int size){
        this.size = size;
        this.stack = new int[size];
    }
    
    Scanner scanner = new Scanner(System.in);

    // Method to push an item onto the stack
    void push() {
        if (top >= size - 1) {
            System.out.println("Overflow!!! \nStack is Full\n");
            return;
        }
        top++;
        System.out.print("Enter item to be pushed: ");
        item = scanner.nextInt();
        stack[top] = item;
    }

    // Method to pop an item from the stack
    void pop() {
        if (top == -1) {
            System.out.println("Underflow!!! \nStack is Empty\n");
            return;
        }
        item = stack[top];
        top--;
        System.out.println("Popped item: " + item);
    }

    // Method to check the status of the stack
    void status() {
        if (top == -1) {
            System.out.println("\n!!!!Stack is Empty!!!!");
        } else {
            if (top >= size - 1) {
                System.out.println("\n!!!!Stack is Full!!!!");
                return;
            }
            System.out.println("\nItem at the top: " + stack[top]);
            System.out.println("Remaining space: " + (size - top - 1));
        }
    }

    // Method to display the contents of the stack
    void display() {
        if(top == -1){
            System.out.println("\n!!!!Stack is Empty!!!!");
            return;
        }
        System.out.println("\nStack is:");
        for(int i = top; i >= 0; i--){
            System.out.println(stack[i]);
        }
    }
}

class StackMain{
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        
        stack.pop(); // Trying to pop from an empty stack
        stack.push();
        stack.display();
        stack.status();
        stack.push();
        stack.push();
        stack.push();
        stack.push();
        stack.push(); // Trying to push onto a full stack
        stack.display();
        stack.status();
        stack.pop();
        stack.display();
        stack.status();
    }
}
