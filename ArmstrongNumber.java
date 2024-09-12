package JavaProgram;
import java.util.Scanner;
// Program no :- 14;

public class ArmstrongNumber {
    public static boolean isArmstrong(int num){
        int rem = 0;
        int temp = num;
        while(num != 0){
            rem = rem + (int)Math.pow((num%10),String.valueOf(temp).length());
            num = num/10;
        }
        return rem == temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 'y';
        int num;
        while(choice != 'n'){
            System.out.print("Enter the number you want to check isArmstrong or not :- ");
            num = sc.nextInt();
            if(isArmstrong(num)){
                System.out.println("The given number is an armstrong number.");
            }
            else{
                System.out.println("The given number is not an armstrong number.");
            }
            System.out.print("do you want to check again if yes(type anything) or no(type n) :- ");
            choice = sc.next().charAt(0);
        }
    }
}
