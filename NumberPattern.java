package JavaProgram;
import java.util.Scanner;
// Program no :- 30;
/*
        1
        2  1
        3  2  1
        4  3  2  1
        5  4  3  2  1
 */
public class NumberPattern {
    public static void pattern(int n){
        for(int i=0; i<=(n-1); i++){
            for(int j=0; j<=i; j++){
                System.out.print((i+1-j)+"  ");
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
            pattern(no_of_lines);
            System.out.print("do you want to continue if yes(type anything or no(type n) :- ");
            choice = sc.next().charAt(0);
        }
    }
}
