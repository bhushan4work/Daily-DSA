package BasicMaths;
import java.util.Scanner ;

//ArmstrongNUm = suppose num=123 so if 1^3 + 2^3 + 3^3 = 123 then its ArmstrongNum

public class ArmstrongNum {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("enter a num: ");
        int n  = scanner.nextInt() ;
        int sum = 0 ;
        int dup = n ;   //for making a duplicate copy of the num to compare with sum

        while(n>0){
            int lastdigit = n % 10 ; //gives lastdigit
            sum += Math.pow(lastdigit,3) ; //does the cube of the lastdigit
            n /= 10 ; //remove lastdigit
        }

        if (dup == sum){
            System.out.println("yes. Its a ArmstrongNum");
        }
        else{
            System.out.println("no. Its not a ArmstrongNum");
        }
        scanner.close(); //closed the scanner
    }
}
