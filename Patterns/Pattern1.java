package Patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            pattern1a(n);
            pattern1b(n);
        }
        scanner.close();
    }

    static void pattern1a(int n){
        for(int i=0; i< n; i++){
            for(int j=0 ; j< n-i-1; j++){
                System.out.print(" ") ;
            }
            for(int j= 0; j< 2*i +1; j++){
                System.out.print("*") ;
            }
            for(int j=0; j< n-i-1; j++){
                System.out.print(" ") ;
            }
            System.out.println() ;
        }
    }

    static void pattern1b(int n){
        for(int i=0; i< n; i++){ //to get a common line in betn put i=1
            for(int j=0 ; j< n+i-n; j++){
                System.out.print(" ") ;
            }
            for(int j= 0; j< 2*(n-i)-1; j++){
                System.out.print("*") ;
            }
            for(int j=0; j< n+i-n; j++){
                System.out.print(" ") ;
            }
            System.out.println() ;
        }
    }
}

