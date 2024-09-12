package JavaProgram;
import java.util.Scanner;
// Program no :- 16;
/*
         *
         **
         ***
         ****
         *****
 */
public class StarPattern1 {
    public static void pattern(int num){
        for(int i=0; i<num; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice = 'y';
        int no_of_lines;
        while(choice != 'n'){
            System.out.print("Enter the number of lines :- ");
            no_of_lines = sc.nextInt();
            pattern(no_of_lines);
            System.out.print("Do you want to continue if yes(type anything or no(type n) :- ");
            choice = sc.next().charAt(0);
        }
        sc.close();
    }
}
