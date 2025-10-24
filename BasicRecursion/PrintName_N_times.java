package BasicRecursion;

import java.util.Scanner ;

public class PrintName_N_times {
    //T.C - O(n) , S.C - O(n) ;

    static void func(int i,int n){
        if(i > n) return;  //base condition ,if this is absent stack overflow takes place
        System.out.println("hello world");
        func(i+1,n);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in) ;
        int n = scanner.nextInt() ;
        func(1,n) ;
    }

}