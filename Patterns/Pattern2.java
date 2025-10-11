package Patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            pattern2(n);
        }
        scanner.close();
    }

    static void pattern2(int n){
        for(int i =0;i<n;i++){
            for(int j=1;j<= n-i;j++){ //for upward put j<=i
                System.out.print(j) ;
            }
            System.out.println() ;
        }
    }
}
