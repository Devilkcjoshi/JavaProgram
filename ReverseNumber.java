package JavaProgram;
import java.util.Scanner;
// Program no :- 11;

public class ReverseNumber {
    public static int reverseNumber(int num){
        int rem = 0;
        while(num != 0){
            rem = (rem*10)+(num%10);
            num /= 10;
        }
        return rem;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        char choice = 'y';
        while(choice != 'n'){
            System.out.print("Enter the number you want to reverse :- ");
            num = sc.nextInt();
            try{
                System.out.println("The number in revers is :- "+reverseNumber(num));
            }
            catch(Exception e){
                e.getStackTrace();
            }
            System.out.print("do you want to continue type yes or no :- ");
            choice = sc.next().charAt(0);
        }
    }
}
