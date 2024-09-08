package JavaProgram;
import java.util.Scanner;
// program no :- 01;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number,fact = 1;
        System.out.print("Enter the number you want to factorial of :- ");
        number = sc.nextInt();
        while(number != 1){
            fact *= number;
            number--;
        }
        System.out.println("The factorial of the given number is :- "+fact);
        sc.close();
    }
}
