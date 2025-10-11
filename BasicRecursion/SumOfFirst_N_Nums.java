import java.util.Scanner ;

public class SumOfFirst_N_Nums {
    //T.C - O(n) , S.C - O(n)
    //recursion happens in 2 ways namely parameterised & functional

    //method1 : parameterised way
    static void sum(int i, int sum, int n){
        if(i>n){
             System.out.println(sum);
             return;
        }
        sum(i+1,sum+i, n);
    }

    //method2 : functional
    //it keeps on calling same fxn until base condn is true , thereafter the fxn returns
    static int summ(int n){
        if(n==0) return 0;
        return n + summ(n-1);
    }

    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in) ;
        int n = scanner.nextInt() ;

        sum(1,0, n);

        System.out.println(summ(n));
    }
}
