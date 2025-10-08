package JCF;

public class ArrayDeque {
    public static void main (String[] args){
        //ArrayDeque (Queue)

        java.util.ArrayDeque<Integer> adq = new java.util.ArrayDeque<>() ;
        adq.offer(572) ;
        adq.offer(52) ;
        adq.offerFirst(45) ; //adds element at 1st
        adq.offerLast(66) ; //adds element at last

        //same method for peek & poll
    }

}
