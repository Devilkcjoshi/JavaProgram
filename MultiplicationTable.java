package JavaProgram;
import java.util.Scanner;
// Program no :- 10;

public class MultiplicationTable {
    public static void table(int num){
        for(int i=1; i<=10; i++){
            System.out.print(i*num+"  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice = 'y';
        int num;
        while (choice != 'n') {
            System.out.print("Enter the number you want the multiplication table of :- ");
            num = sc.nextInt();
            table(num);
            System.out.print("Do you want to continue if yes(type anything) or no(type n) :- ");
            choice = sc.next().charAt(0);
        }
    }
}
