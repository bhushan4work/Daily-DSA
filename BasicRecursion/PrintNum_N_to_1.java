package BasicRecursion;

import java.util.Scanner ;

public class PrintNum_N_to_1 {
    //method1
    static void func(int i, int n){
        if(i<1) return;
        System.out.println(i);
        func(i-1,n);
    }
    //method2 : by backtracking i.e using '+' rather than '-'
    static void funcc(int i, int n){
        if(i>n) return ;
        funcc(i+1, n);
        System.out.println(i);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in) ;
        int n = scanner.nextInt() ;
        func(n,n) ; //we start from n so here i is taken as n in fxn
        funcc(1,n) ;
    }
}
