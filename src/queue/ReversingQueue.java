package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReversingQueue {
    /*
           I/P : 12 5 15 20
           O/P : 20 5 15 12
     */
    static void print(Queue<Integer> q){
        for(Integer x : q){
            System.out.println(x + " ");
        }
    }
    static  void reverse(Queue<Integer> q){
        if(q.isEmpty()){
            return ;
        }
        int x = q.peek();
        q.remove(x);
        reverse(q);
        q.add(x);
    }
    public static void main(String[] args) {


        Queue<Integer> q = new LinkedList<Integer>();
        q.add(12);
        q.add(5);
        q.add(15);
        q.add(20);
        reverse(q);
        print(q);
    }
}
