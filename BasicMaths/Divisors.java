package BasicMaths;
import java.util.Scanner;
import java.util.List ;
import java.util.ArrayList ;
import java.util.Collections ;

public class Divisors {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in) ;
        int n = scanner.nextInt();
        scanner.nextLine() ;


        //method1
        //below loop runs for n iterations, T.C is O(n)
        for(int i =1 ;i <=n ;i++){
            if(n%i==0){
                System.out.print(i + " ");
            }
        }

        //method2
        //suppose n=36 so its factors are 1*36, 2*18 ,etc but after 6*6 the factors repeat itself
        // so we wanna print till 6*6 only as we get all factors .
        List<Integer> list = new ArrayList<>();     //list that stores values
        //O(sqrt(n)) - T.C
        for(int i=1; i<= Math.sqrt(n) ; i++){
            if(n%i==0){
                list.add(i) ;
                if( n/i != i){
                    list.add(n/i) ;
                }
            }
        }
        //O(n  log n) : n is num of factors - T.C
        Collections.sort(list);    // sorts list into ascending order
        //O(num of factors) - T.C
        for(int it : list ){
            System.out.print(it + " ");
        }
        //for total T.C ,add all T.C

    }

}
