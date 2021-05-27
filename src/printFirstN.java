import java.util.LinkedList;
import  java.util.*;
import java.util.Queue;
/*
     I/P : n = 5
     O/P : 5 6 55 56 65

     I/P : n = 6
     O/P : 5 6 55 56 65 66
*/
public class printFirstN {

    static  void  printFirst(int n){
        Queue<String> q = new LinkedList<>();
        q.add("5");
        q.add("6");
        for(int i=0;i<n;i++){
            String x = q.poll();
            System.out.print(x +" ");
            q.add(x+"5");
            q.add(x+"6");

        }
    }
    public static void main(String[] args) {
        int n = 6;
        printFirst(n);
    }
}
