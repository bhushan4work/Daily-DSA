package JCF;
import java.util.Arrays ;

public class ArraysClassDemo {
    public  static void main(String[] args){
        //ArraysClass

        int[] numbering = {1,2,3,4,5,6,7} ;
        Arrays.binarySearch(numbering,7) ;  //binarysearch works in sorted array only ,gives index of the element

        Arrays.sort(numbering) ; ; //sorts array if not in order
        for(int i : numbering){
            System.out.println(); //prints the sorted array
        }

        Arrays.fill(numbering,12) ; //fills whole array with 12
    }

}