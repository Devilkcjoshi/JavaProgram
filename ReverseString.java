package JavaProgram;
import java.util.Scanner;
// Program no :- 15;

public class ReverseString {
    public static String reverseString(String name){
        StringBuilder new_string = new StringBuilder();
        for(int i=(name.length() - 1); i>=0; i--){
            new_string.append(name.charAt(i));
        }
        return new_string.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        char choice = 'y';
        while(choice != 'n'){
            System.out.print("Enter the word :- ");
            word = sc.nextLine();
            System.out.println("The reverse of the string is :- "+reverseString(word));
            System.out.print("do you want to reverse another number if yes(type anything) or no(type n) :- ");
            choice = sc.next().charAt(0);
            sc.nextLine();
        }
        sc.close();
    }
}
