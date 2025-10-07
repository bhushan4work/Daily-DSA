package Patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            pattern6(n);
        }
        scanner.close();
    }

    static void pattern6(int n){
        for(int i=0;i<n;i++){
            for(char ch='A';ch <= 'A'+i;ch++){
                System.out.print(ch + " ") ;
            }
            System.out.println() ;
        }
    }
}
