package JavaProgram;
import java.util.Scanner;
// Program no :- 34

public class MatrixMultiplication {
    public static void arrayInput(int[][] arr){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public static void display(int[][] arr){
        for(int[] i : arr){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice = 'y';
        while(choice != 'n') {
            int r1, c1, r2, c2;
            System.out.print("Enter r1 :- ");
            r1 = sc.nextInt();
            System.out.print("Enter c1 :- ");
            c1 = sc.nextInt();
            System.out.print("Enter r2 :- ");
            r2 = sc.nextInt();
            System.out.print("Enter c2 :- ");
            c2 = sc.nextInt();
            int[][] a = new int[r1][c1];
            int[][] b = new int[r2][c2];
            int[][] c;
            if(c1 == r2){
                c = new int[r1][c2];
                System.out.println("Enter the element of the first matrix :- ");
                arrayInput(a);
                System.out.println("Enter the element of the second matrix :- ");
                arrayInput(b);
                for(int i=0; i<r1; i++){
                    for(int j=0; j<c2; j++){
                        for(int k=0; k<r2; k++){
                            c[i][j] = c[i][j] + (a[i][k]*b[k][j]);
                        }
                    }
                }
                System.out.println("The multiplication matrix is :- ");
                display(c);
                System.out.print("Do you again want to multiply any matrix if yes(type anything) or no(type n) :- ");
                choice = sc.next().charAt(0);
            }
            else{
                System.out.println("The multiplication can't perform in these matrix :- ");
            }
        }
    }
}
