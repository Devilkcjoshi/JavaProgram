package JavaProgram;
import java.util.Scanner;
// Program no :- 32

public class PrimeNumberSeries {
    public static boolean isPrime(int num){
        int temp = 0;
        for(int i=2; i<=(Math.sqrt(num)); i++){
            if( i<=1){
                return false;
            }
            else if(num % i == 0){
                temp++;
            }
        }
        return temp==0;
    }
    public static void show(int num){
        for(int i=2; i<=num; i++){
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        char choice = 'y';
        while(choice != 'n'){
            System.out.print("Enter up to which number you want prime number series :- ");
            num = sc.nextInt();
            show(num);
            System.out.println();
            System.out.print("Do you want to continue if yes(type anything) or no(type n) :- ");
            choice = sc.next().charAt(0);
        }
    }
}
