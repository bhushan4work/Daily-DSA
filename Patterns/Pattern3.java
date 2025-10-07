package Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            pattern3(n);
        }
        scanner.close();
    }

    static void pattern3(int n){
        for(int i=0;i<n;i++){
            int start=1;
            if(i % 2 ==0){
                start=1;
            }
            else{
                start=0 ;
            }
            for(int j=0;j<=i;j++){
                System.out.print(start) ;
                start = 1 - start ;
            }
            System.out.println() ;
        }
    }
}
