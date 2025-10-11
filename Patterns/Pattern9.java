package Patterns;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            pattern9(n);
        }
        scanner.close();
    }

    static void pattern9(int n){
        for(int i=0; i< n; i++){
            for(char ch=(char)('A'+ (n-i-1) ) ; ch<= 'A'+ n-1; ch++){ //or put ch='e'-i;ch<='e'
                System.out.print(ch) ;
            }
            System.out.println() ;
        }
    }
}
