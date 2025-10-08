package JCF;
import java.util.ArrayDeque ;

public class ArrayDequeDemo {
    public static void main (String[] args){
        //ArrayDeque (Queue)

        ArrayDeque<Integer> adq = new ArrayDeque<>() ;
        adq.offer(572) ;
        adq.offer(52) ;
        adq.offerFirst(45) ; //adds element at 1st
        adq.offerLast(66) ; //adds element at last

        //same method for peek & poll
    }

}