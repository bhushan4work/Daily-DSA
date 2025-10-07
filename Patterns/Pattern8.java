package Patterns;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            pattern8(n);
        }
        scanner.close();
    }

    static void pattern8(int n){
        for(int i=0; i< n; i++){
            for(int j=0 ; j< n-i-1; j++){
                System.out.print(" ") ;
            }

            char ch='A' ;
            int breakpoint = (2*i+1)/2; //decr after half
            for(int j= 0; j< 2*i +1; j++){
                System.out.print(ch) ;
                if(j<breakpoint){
                    ch++;
                }
                else{
                    ch--;
                }
            }
            for(int j=0; j< n-i-1; j++){
                System.out.print(" ") ;
            }
            System.out.println() ;
        }
    }
}
