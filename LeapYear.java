package JavaProgram;
import java.util.Scanner;
// Program no :- 07;

public class LeapYear {
    public static boolean isLeapYear(int year){
        if(year % 4 ==0 && year % 400 ==0){
            return true;
        }
        else{
            if(year %4 == 0 ){
               if(year % 100 == 0 ){
                   return false;
               }
               else{
                   return true;
               }
            }
            else{
                return false;
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        char choice = 0;
        while(choice != 'N'){
            System.out.print("Enter the year :- ");
            year = sc.nextInt();
            if(isLeapYear(year)){
                System.out.println("The given year is a leap year.");
            }
            else{
                System.out.println("The given year is not a leap year.");
            }
            System.out.print("do you want to continue(type Y) or not(type N) :- ");
            choice = sc.next().charAt(0);
        }
    }
}
