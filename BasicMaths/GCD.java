package BasicMaths;
import java.util.Scanner ;

//The Greatest Common Divisor of any two int is the largest num that divides both int.

public class GCD {
    public static void main(String[] args){
        //method1
        //O( min(n1,n2) ) - T.C
        Scanner scanner = new Scanner(System.in) ;
        int n1 = scanner.nextInt() ;
        int n2 = scanner.nextInt() ;

        for(int i = Math.min(n1,n2); i >=1 ; i--){
            if(n1 % i ==0 && n2 % i ==0){
                System.out.println(i);
                break ;
            }
        }

        //method2
        //when log is taken in T.C ? whenever there is division,num of iterations is in terms of log
        //also as n1 & n2 changes each time we cant give it a base so take it as a variable
        //T.C - O( log base t min(n1,n2))  where t is variable according to input
        
        //Euclidean algorithm - gcd(n1,n2) = gcd(n1-n2,n2)
        //instead of substracting again n again here , we can use
        // (greater % smaller) to avoid unwanted steps and jump near the ans

        while(n1 > 0 && n2 >0 ){
            if(n1>n2){
                n1 %= n2 ;
            }
            else{
                n2 %= n1 ;
            }

            if(n1 ==0 ){
                System.out.println(n2) ;
            }
            else{
                System.out.println(n1) ;
            }

        }

    }
}
