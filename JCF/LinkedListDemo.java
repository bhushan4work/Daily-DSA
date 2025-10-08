package JCF;
import java.util.Queue;


public class LinkedListDemo {
    public static void main (String[] args){
        //LinkedList (Queue)
        //element added 1st is removed 1st in queue
        Queue<Integer> queue = new java.util.LinkedList<>() ;
        queue.offer(3) ; //adds element
        queue.offer(6) ; //can also use queue.add() but it is seen as dangerous code here
        queue.poll();  //removes & prints last value,so 3 here
        //can also use queue.remove() but it gives an exception error whereas poll prints null
        queue.peek() ; //tells which element will be removed next,here after 3 is 6
        //queue.element() is also used but it gives an error if the queue is empty whereas peek prints null
    }

}