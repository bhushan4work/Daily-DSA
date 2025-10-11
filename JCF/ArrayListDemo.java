package JCF;
import java.util.List ;

public class ArrayListDemo {
    public static void main(String[] args){
        //ArrayList
        //LHS is interface & RHS is implementation
        java.util.ArrayList<String> name = new java.util.ArrayList<>(); // makes empty array
        name.add("sam"); // can add no of strings in this array

        List<Integer> list = new java.util.ArrayList<>(); //to do LinkedList (List) just change ArrayList to LinkedList here
        list.add(4);
        list.add(9);
        list.add(1, 67); // adds 67 at index1 in this array

        List<Integer> newlist = new java.util.ArrayList<>();
        newlist.add(10);
        newlist.add(34);
        //list.addAll(newlist) ;   //adds newlist to the list

        list.remove(Integer.valueOf(4)); //removes 4 once from the array
        //list.clear() ; //prints empty list
        list.set(1, 100); //replaces value at index1 to 100
        list.contains(50); //gives boolean if 50 exists in array or not

        for (int i = 0; i < list.size(); i++) {
            // System.out.println( list.get(i)) ;  //iterates the array
        }
        for (Integer element : list) {
            //System.out.println("element is "+ element) ; // 'for each' loop
        }


    }

}
