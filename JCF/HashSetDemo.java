package JCF;
import java.util.Set;

public class HashSetDemo {
    public static void main (String[] args){
        //HashSet (set) ,duplicate-not allowed, order of element is unordered so it changes each time u print
        //implementation of LinkedHashSet in rhs is same as below, it just prints in the order u add
        //implementation of TreeSet in rhs is same as below, it just prints in sorted order or ascending u can say

        Set<Integer> set = new java.util.HashSet<>() ;
        set.add(54) ; //to add an element
        set.remove(54) ; // removes element
        set.contains(1000) ; //returns boolean if element exists or not
        set.isEmpty() ; //gives boolean if set is empty or not
        set.size() ; //num of elements in set
        set.clear() ; //clears the whole set
    }

}