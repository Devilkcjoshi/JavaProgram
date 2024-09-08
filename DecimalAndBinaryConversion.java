package JavaProgram;
import java.util.Scanner;
// program no :- 02

public class DecimalAndBinaryConversion {
    public static void decimalToBinary(int number){
        int rem = 0,i = 1;
        while(number!=0){
            rem += (number%2)*i;
            number = number/2;
            i *= 10;
        }
        System.out.println("The number in binary is :- "+rem);
    }
    public static void binaryToDecimal(int number){
        int rem = 0,i=0;
        while(number!=0){
            rem += (int) ((int)(number%10)*Math.pow(2,i));
            number /= 10;
            i++;
        }
        System.out.println("The number in decimal is :- "+rem);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number you want to convert :- ");
        num  = sc.nextInt();
        System.out.println("do you want to convert the no into decimal(type 1) or into binary(type any thing)");
        int choice = sc.nextInt();
        if(choice == 1){
            binaryToDecimal(num);
        }
        else{
            decimalToBinary(num);
        }
        sc.close();
    }
}
