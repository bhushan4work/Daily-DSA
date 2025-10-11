package JCF;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionClassDemo {
    public static void main(String[] args){
        //CollectionClass

        List<Integer> listtt = new ArrayList<>();
        listtt.add(69) ;
        listtt.add(89) ;
        listtt.add(79) ;
        //System.out.println(Collections.min(listtt)); //prints min value
        //System.out.println(Collections.max(listtt)); //prints max value
        //System.out.println(Collections.frequency(listtt,69)); //prints frequency of the num in array
        java.util.Collections.sort(listtt) ; //sorts in default ascending order
        java.util.Collections.sort(listtt,Comparator.reverseOrder()); //sorts in descending order
    }


}