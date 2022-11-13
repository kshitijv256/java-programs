import java.io.*;

class StackArray {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public StackArray(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long j) {
        stackArray[++top] = j;
    }

    public long pop() {
        return stackArray[top--];
    }

    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) throws IOException {
        StackArray theStack = new StackArray(10);
        System.out.println("Enter 1. Push 2. Pop 3. Display 4. Exit");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice = Integer.parseInt(br.readLine());
        while (choice != 4) {
            switch (choice) {
            case 1:
                System.out.println("Enter the element to be pushed");
                long element = Long.parseLong(br.readLine());
                theStack.push(element);
                break;
            case 2:
                System.out.println("The popped element is " + theStack.pop());
                break;
            case 3:
                System.out.println("The element are :");
                theStack.display();
                break;
            default:
                System.out.println("Invalid choice");
            }
            System.out.println("Enter 1. Push 2. Pop 3. Display 4. Exit");
            choice = Integer.parseInt(br.readLine());
        }
    }
}