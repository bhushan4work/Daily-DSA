package BasicRecursion;

import java.util.Scanner ;

public class PrintNum_1_to_N {
    //method1
    static void func(int i,int n){
        if (i>n) return;
        System.out.println(i);
        func(i+1, n);
    }

    //method2 :without using '+' i.e by backtracking
    static void funcc(int i,int n){
        if(i<1) return;
        funcc(i-1, n) ;  //we call this fxn first before print,this goes on till i<1 &
        //once its true 'return' starts executing back so we get 1,2,..N
        System.out.println(i);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in) ;
        int n = scanner.nextInt() ;
        func(1,n) ;
        funcc(n ,n);
    }
}