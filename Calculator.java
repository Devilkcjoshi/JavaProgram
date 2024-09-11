package JavaProgram;
import java.util.Scanner;
// program no :- 09

public class Calculator {
    public static void calculation(double a,double b,char c){
        switch(c){
            case '+':
                System.out.println("The sum of a and b is :- "+(a+b));
                break;
            case '-':
                System.out.println("The a-b is :- "+(a-b));
                break;
            case '*':
                System.out.println("The multiplication of a and b is :- "+(a*b));
                break;
            case '/':
                try{
                    System.out.println("a/b :- "+(a/b));
                }
                catch(Exception e){
                    System.out.println(e);
                }
                break;
            default:
                System.out.println("wrong operation.");
                break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        char operator;
        char choice = 'y';
        while (choice != 'n') {
            System.out.print("Enter a :- ");
            a = sc.nextInt();
            System.out.print("Enter b :- ");
            b = sc.nextInt();
            System.out.print("Enter the operation you want to perform :- ");
            operator = sc.next().charAt(0);
            calculation(a,b,operator);
            System.out.println("do you want to continue the calculation :- ");
            choice = sc.next().charAt(0);
        }
    }
}
