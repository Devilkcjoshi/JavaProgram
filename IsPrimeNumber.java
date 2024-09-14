package JavaProgram;
import java.util.Scanner;
// Program no :- 31

public class IsPrimeNumber {
    public static void isPrime(int num){
        int temp = 0;
        for(int i=2; i<=(Math.sqrt(num)); i++){
            if(num % i == 0) {
                temp = temp + 1;
            }
        }
        if(temp == 0){
            System.out.println("The given number is a prime number.");
        }
        else{
            System.out.println("The given number is not a prime number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        char choice = 'y';
        while(choice != 'n'){
            System.out.print("Enter the no you want to check is prime or not :- ");
            num = sc.nextInt();
            isPrime(num);
            System.out.print("Do you want to check again if yes(type anything) or no(type n) :- ");
            choice = sc.next().charAt(0);
        }
    }
}
