package JavaProgram;
import java.util.Scanner;
// Program no :- 13;

public class PalindromeNumber {
    public static boolean isPalindrome(int number){
        int temp = number;
        int rem = 0;
        while(number != 0){
            rem = (rem*10)+(number%10);
            number = number/10;
        }
        System.out.println(rem);
        return rem == temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice = 'y';
        while(choice != 'n'){
            System.out.print("Enter the number you want to check :- ");
            int num = sc.nextInt();
            if(isPalindrome(num)){
                System.out.println("Yes the given no is a palindrome number");
            }
            else{
                System.out.println("No the given no is not a palindrome number.");
            }
            System.out.print("do you want to check again if yes(type anything) and if no(type n) :- ");
            choice = sc.next().charAt(0);
        }
        sc.close();
    }
}
