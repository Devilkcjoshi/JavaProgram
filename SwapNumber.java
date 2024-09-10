package JavaProgram;
import java.util.Scanner;
// Program no :- 08

public class SwapNumber {
    public static String swapTwoNumbers(float a,float b){
        a = a+b;
        b = a-b;
        a = a-b;
        return ("a :- "+a+" and b :- "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b;
        System.out.print("enter a :- ");
        a = sc.nextFloat();
        System.out.print("enter b :- ");
        b = sc.nextFloat();
        System.out.println(swapTwoNumbers(a,b));
    }
}
