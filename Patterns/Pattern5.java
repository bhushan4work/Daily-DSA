package Patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            pattern5(n);
        }
        scanner.close();
    }

    static void pattern5(int n){
        int num = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num + " ") ;
                num++ ;
            }
            System.out.println() ;
        }
    }
}
