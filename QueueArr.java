import java.io.*;

public class QueueArr {
    private int maxSize;
    private long[] queueArray;
    private int front;
    private int rear;
    long element;


    public QueueArr(int s) {
        maxSize = s;
        queueArray = new long[maxSize];
        front = 0;
        rear = -1;
    }
    public void insert() {
        if (rear >= maxSize - 1) {
            System.out.println("Queue is full");
        }else{
            try{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the element to be inserted");
                element = Long.parseLong(br.readLine());
            }catch(IOException e){
                System.out.println("Error");
            }
            rear++;
            queueArray[rear] = element;
        }
    }
    public void delete() {
        if (front > rear) {
            System.out.println("Queue is empty");
        }else{
            System.out.println("The removed element is " + queueArray[front]);
            front++;
        }
    }
    public void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
        }else{
            System.out.println("The elements are :");
            for (int i = front; i <= rear; i++) {
                System.out.print(queueArray[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws IOException {
        QueueArr theQueue = new QueueArr(10);
        System.out.println("Enter 1. Insert 2. Delete 3. Display 4. Exit");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice = Integer.parseInt(br.readLine());
        while (choice != 4) {
            switch (choice) {
            case 1:
                theQueue.insert();
                break;
            case 2:
                theQueue.delete();
                break;
            case 3:
                theQueue.display();
                break;
            default:
                System.out.println("Invalid choice");
            }
            System.out.println("Enter 1. Insert 2. Delete 3. Display 4. Exit");
            choice = Integer.parseInt(br.readLine());
        }

    }
}
