class Queue {
    int front = 0, rear = -1;
    int size = 5;
    int[] queue = new int[size];

    void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue is Full");
        } else {
            queue[++rear] = value;
            System.out.println(value + " inserted");
        }
    }

    void dequeue() {
        if (front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println(queue[front++] + " removed");
        }
    }

    void display() {
        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }
}

public class QueueImplemenation {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(5);
        q.enqueue(10);
        q.dequeue();
        q.display();
    }
}

