package JavaProgram;
import java.util.Scanner;
// program no :- 29;
/*
  1                          1
  1 2                        2 2
  1 2 3                      3 3 3
  1 2 3 4                    4 4 4 4
  1 2 3 4 5                  5 5 5 5 5
 */

public class NumberPattern1 {
    public static void pattern1(int n){
        for(int i=0; i<=(n-1); i++){
            for(int j=0; j<=i; j++){
                System.out.print(" "+(j+1));
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int i=0; i<=(n-1); i++){
            for(int j=0; j<=i; j++){
                System.out.print(" "+(i+1));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_of_lines;
        char choice = 'y';
        while(choice != 'n'){
            System.out.print("Enter the number of lines :- ");
            no_of_lines = sc.nextInt();
            pattern1(no_of_lines);
            pattern2(no_of_lines);
            System.out.print("Do you want to continue if yes(type anything or no(type n) :- ");
            choice = sc.next().charAt(0);
        }
    }
}
