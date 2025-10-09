package BasicMaths;
import java.util.Scanner ;

public class PrimeNum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in) ;
        int n = scanner.nextInt() ;

        // T.C - O( sqrt(n) )

        int count =0 ;
        for(int i =1;i*i<=n ;i++){
            if(n%i==0){
                count++ ;
                if(n/i != i){
                    count++ ;
                }
            }
        }
        if(count ==2){
            System.out.println("yes .Its a primeNum");
        }
        else{
            System.out.println("no. Its not a primeNum");
        }
    }
}
