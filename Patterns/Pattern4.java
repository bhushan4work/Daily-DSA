package Patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            pattern4(n);
        }
        scanner.close();
    }

    static void pattern4(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j) ;
            }
            for(int j=1;j<=2*n-2-2*i;j++){
                System.out.print(" ") ;
            }
            for(int j=i;j>= 1;j--){ //to reverse the nums
                System.out.print(j) ;
            }
            System.out.println() ;
        }
    }
}
