package Patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            pattern7(n);
        }
        scanner.close();
    }

    static void pattern7(int n){
        for(int i=0;i<n;i++){
            char ch = (char)('A' + i) ;
            for(int j=0; j<=i ; j++){
                System.out.print(ch) ;
            }
            System.out.println() ;
        }
    }
}
