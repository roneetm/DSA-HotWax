package Queue;

public class Queue {
    int rear = -1;
    int front = -1;
    int[] a;
    int size;

    public Queue(int size) {
        a = new int[size];
        this.size = size;
    }

    public void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            a[rear] = data;
        }
    }

    public void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        } else {
            front++;
        }
    }

    public void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(a[i] + " -- ");
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.display();
    }
}