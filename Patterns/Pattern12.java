package Patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            pattern12(n);
        }
        scanner.close();
    }

    static void pattern12(int n){
        for(int i=0; i< n; i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("*") ;
                }
                else{
                    System.out.print(" ") ;
                }
            }
            System.out.println() ;
        }
    }
}
