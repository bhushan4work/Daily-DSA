package BasicRecursion;//FibonacciNum- fib(n) = fib(n-1) + fib(n-2) or sum of prev 2 nums

public class FibonacciNum  {

    //Leetcode - 509. Fibonacci Number -- Easy
    //3 functional recursion with multiple calls
    static int fibonacci(int N){ //fxn is made for 3rd method
        // Base Condition.
        if(N <= 1){
            return N;
        }
        // Problem broken down into 2 functional calls
        // and their results combined and returned.
        int last = fibonacci(N-1);
        int slast = fibonacci(N-2);
        return last + slast;
    }

    public static void main(String[] args) {
        //1 naive approach
        int n = 5;
        if (n == 0) {
            System.out.println(0);
        }
        else {
            int fib[] = new int[n + 1]; //makes an array named fib
            fib[0] = 0;
            fib[1] = 1; //fib nums aint for -ve nums so we dont count for it & count from 2
            for (int i = 2; i <= n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2]; //looped from 2 to avoid error in 0,1 case
            }
            System.out.println("The Fibonacci Series up to "+n+"th term:");
            for (int i = 0; i <= n; i++) {
                System.out.print(fib[i] + " ");
            }
        }

        //2 space optimized
        n = 5;
        if (n == 0) {
            System.out.println("The Fibonacci Series up to "+n+"th term:");
            System.out.print(0);
        }
        else {
            int secondLast = 0;
            int last = 1;
            System.out.println("The Fibonacci Series up to "+n+"th term:");
            System.out.print(secondLast + " " + last + " ");
            int cur;
            for (int i = 2; i <= n; i++) {
                cur = last + secondLast;
                secondLast = last;
                last = cur;
                System.out.print(cur + " ");
            }
        }

        //3
        // Here, let’s take the value of N to be 4.
        int N = 4;
        System.out.println(fibonacci(N));
    }
}