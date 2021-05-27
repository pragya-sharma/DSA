package queue;

import java.util.*;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Queue{
    Node front,rear;
    public Queue(){
        this.front=this.rear=null;
    }
    void enqueue(int data){
        Node temp = new Node(data);
        if(front == null){
            this.front = this.rear = temp;
            return;
        }
        this.front = this.front.next;
        this.front = temp;
    }
    void dequeue(){
        if(this.front == null){
            return ;
        }
        Node temp = this.front;

        this.front = this.front.next;

        if(this.front == null){
            this.rear = null;
        }

    }


}


public class QueueUsingLinkedList {
    public static void main(String[] args){
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println("queue front : " + q.front.data);
        System.out.println("queue rear : " + q.rear.data);

    }

}
















