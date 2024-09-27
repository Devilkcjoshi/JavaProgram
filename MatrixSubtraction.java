package JavaProgram;

import java.util.Scanner;

public class MatrixSubtraction {
    public static void scanElement(int[][] arr){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public static void subtract(int[][] a,int[][] b,int[][] c){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                c[i][j] = a[i][j]-b[i][j];
            }
        }
    }
    public static void display(int[][] arr){
        for(int[] i:arr ){
            for(int j:i){
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
            int[][] c = new int[r1][c1];
            System.out.println("Enter the elements of the first matrix :- ");
            scanElement(a);
            System.out.println("Enter the elements of the second matrix :- ");
            scanElement(b);
            if (r1 == r2 && c1 == c2) {
                subtract(a,b,c);
                System.out.println("The sum of the matrix is :- ");
                display(c);
            }
            else{
                System.out.println("the addition can not be perform.");
            }
            System.out.print("Do you want to continue the addition if yes(type anything or no(type n) :- ");
            choice = sc.next().charAt(0);
        }
    }
}
