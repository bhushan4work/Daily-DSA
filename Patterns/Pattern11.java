package Patterns;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            pattern11a(n);
            pattern11b(n);
        }
        scanner.close();
    }

    static void pattern11a(int n){
        for(int i=0; i< n; i++){
            for(int j=0;j<=i;j++){
                System.out.print("*") ;
            }
            for(int j=0;j<2*(n-i)-2;j++){
                System.out.print(" ") ;
            }
            for(int j=0;j<=i;j++){
                System.out.print("*") ;
            }
            System.out.println() ;
        }
    }

    static void pattern11b(int n){
        for(int i=1; i< n; i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*") ;
            }
            for(int j=1;j<=2*i;j++){
                System.out.print(" ") ;
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("*") ;
            }
            System.out.println() ;
        }
    }
}
