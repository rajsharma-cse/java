package stack;
class Stack {
    int arr[] = new int[5];
    int top = -1;
}
class StackOperations {
    boolean isEmpty(Stack s) {
        return s.top == -1;
    }
    void push(Stack s, int val) {
        if (s.top < s.arr.length - 1) {
            s.arr[++s.top] = val;
        } else {
            System.out.println("Stack Overflow!");
        }
    }
    int pop(Stack s) {
        if (isEmpty(s)) {
            System.out.println("Stack Underflow!");
            return -1; // Error value
        }
        return s.arr[s.top--];
    }
    void sort(Stack a, Stack b) {
        while (!isEmpty(a)) {
            int temp = pop(a);
            while (!isEmpty(b) && b.arr[b.top] > temp) {
                push(a, pop(b));
            }
            push(b, temp);
        }
    }
    void printStack(Stack s) {
        if (isEmpty(s)) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i <= s.top; i++) {
            System.out.print(s.arr[i] + " ");
        }
        System.out.println();
    }
}
public class revStack {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        StackOperations operations = new StackOperations();
        operations.push(stack1, 1);
        operations.push(stack1, 10);
        operations.push(stack1, 9);
        operations.push(stack1, 5);
        operations.push(stack1, 8);
        System.out.println("Stack 1 before sorting:");
        operations.printStack(stack1);
        operations.sort(stack1, stack2);
        System.out.println("Stack 2 after sorting in ascending order:");
        operations.printStack(stack2);
    }
}
