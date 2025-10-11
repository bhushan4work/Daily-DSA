package JCF;
import java.util.Map;

public class HashMapDemo {
    public static  void main (String[] args){
        //HashMap (map)  prints key & their values , keys are unique (it cant be repeated)
        //implementation of TreeMap in rhs is same as below, it just prints in sorted order or alphabetical u can say

        Map<String, Integer> nums = new java.util.HashMap<>() ;
        nums.put("one", 1) ;
        nums.put("two", 2) ;
        nums.put("two",23) ; //overrides the key two
        nums.putIfAbsent("two" ,23) ;//prints only if key absent
        nums.containsKey(66) ; //gives boolean
        nums.containsValue(77) ; //gives boolean
        nums.isEmpty() ; //gives boolean
        nums.remove("two") ; //removes key


        for(Map.Entry<String,Integer> e: nums.entrySet()){
            //System.out.println(e) ; //prints the key:value pair
            //System.out.println(e.getKey()); //prints key
            //System.out.println(e.getValue()) ; //prints value
        }

        for(String key : nums.keySet()){
            System.out.println() ;
        }

        for(Integer value : nums.values()){
            System.out.println();
        }
    }


}