package JavaProgram;
import java.util.Scanner;
// Program no :- 12;

public class FibonacciSeries {
    public static void fibSeries(int x,int y,int t){
        int i = 2;
        int z;
        System.out.print(x+"  ");
        System.out.print(y+"  ");
        do{
            z = x+y;
            System.out.print(z+"  ");
            x = y;
            y = z;
            i++;
        }while(i<t);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0,b = 1;
        int term;
        System.out.print("Enter in how many terms you want to print the fibonacci series :- ");
        term = sc.nextInt();
        fibSeries(a,b,term);
    }
}
