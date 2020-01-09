package work4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Test1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        Queue<String> queue2 = new LinkedList<String>();
        ArrayList<String> a = new ArrayList<String>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        System.out.print("进栈：");
        for (String q : queue) {
            a.add(q);
            System.out.print(q);
        }
        for (int i = a.size() - 1; i >= 0; i--) {
            queue2.offer(a.get(i));
        }
        System.out.println("");
        System.out.print("出栈：");


        for (String q : queue2) {
            System.out.print(q);
        }
    }
}
