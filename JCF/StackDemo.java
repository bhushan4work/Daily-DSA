package JCF;
import java.util.Stack ;

public class StackDemo {

    public static void main(String[] args){
        //Stack
        //think of it like a bucket,u keep on adding elements & last element is the at top
        Stack<String> animals = new Stack<>() ;
        animals.push("lion") ; // adds elements
        animals.push ("dog") ;

        animals.peek() ; //prints the top element,here it is dog as we pushed it at last in bucket
        animals.pop() ; //removes the top element,here it is dog
    }

}