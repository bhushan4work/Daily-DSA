package Patterns;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            pattern13(n);
        }
        scanner.close();
    }

    static void pattern13(int n){
        for(int i=0; i< 2*n-1; i++){
            for(int j=0;j<2*n-1;j++){
                int up= i;
                int down= 2*n-2-i ;
                int right= 2*n-2 -j ;
                int left=j;
                System.out.print(n - Math.min(Math.min(up,down) , Math.min(right,left) ) + " ") ;

            }
            System.out.println() ;
        }
    }
}
