package JCF;
import java.util.Queue;

public class PriorityQueueDemo {

    public static void main(String[] args){
        //PriorityQueue (Queue), it uses minheap
        //       12           <- Root (smallest)
        //      /  \
        //    36    24        <- Children
        //   /
        //  40               <- Leaf

        //to change priority from minheap to maxheap,pass this in rhs <>(Comparator.reverseOrder())

        Queue<Integer> pq =new java.util.PriorityQueue<>() ; //by default smallest num has highest priority
        pq.offer(40) ;
        pq.offer(12);
        pq.offer(24) ;
        pq.offer(36) ;
        // pq.poll() ; //removes num having highest priority first ,here it is 23
        //poll removes in sorting order like priority is min so here 12,24,36,40
        pq.peek() ; //same work as done in previous
    }

}