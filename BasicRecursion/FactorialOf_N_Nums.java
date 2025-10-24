package BasicRecursion;

import java.util.Scanner;

public class FactorialOf_N_Nums {

    static int fact(int n){
        if(n==0){
            return 1;  //we return 1 as in '*' if we return 0,whole eqn will get zero after base condn gets true
        }
        else{
            return n * fact(n-1) ;
        }
    }
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in) ;
        int n = scanner.nextInt() ;
        System.out.println(fact(n));
    }
}