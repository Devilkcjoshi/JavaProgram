package JavaProgram;
import java.util.Scanner;
// Program no :- 33;

public class PascalTriangle {
    public static int fact(int n){
        if(n ==0 ){
            return 1;
        }
        else{
            int temp = 1;
            while(n != 1){
                temp = temp*n;
                n--;
            }
            return temp;
        }
    }
    public static int combination(int n,int r){
        return (fact(n)/(fact((n-r))*fact(r)));
    }
    public static void triangle(int num){
        for(int i=0; i<num; i++){
            for(int k=(num-1); k>=i; k--){
                System.out.print("   ");
            }
            for(int j=0; j<=i; j++){
                System.out.print(combination(i,j)+"     ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char choice = 'y';
        Scanner sc = new Scanner(System.in);
        while(choice != 'n') {
            System.out.print("Enter the number of lines you want to print :- ");
            int num = sc.nextInt();
            triangle(num);
            System.out.print("Do you want continue if yes(type anything) or no(type n) :- ");
            choice = sc.next().charAt(0);
        }
    }
}
