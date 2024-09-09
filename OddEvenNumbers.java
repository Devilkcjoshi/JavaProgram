package JavaProgram;
import java.util.Scanner;
// Program no :- 06

public class OddEvenNumbers {
    public static void evenOrOdd(int number){
        if(number % 2 == 0){
            System.out.println("The given number is even.");
        }
        else{
            System.out.println("The given number is  odd.");
        }
    }
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check :- ");
        num = sc.nextInt();
        evenOrOdd(num);
    }
}
