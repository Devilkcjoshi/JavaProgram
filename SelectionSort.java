package JavaProgram;
import java.util.Scanner;
// Program no :- 39;

public class SelectionSort {
    public static void display(int[] arr){
        for(int i:arr){
            System.out.print(i+"  ");
        }
        System.out.println();
    }
    public static void selectionSort(int[] arr){
        for(int i=0; i<(arr.length-1); i++){
            int temp = 0;
            int min = i;
            for(int j=(i+1); j<arr.length; j++){
                if(arr[j]<arr[min]){
                    temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice = 'y';
        while(choice != 'n'){
            System.out.print("Enter the size of the array :- ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.print("Enter the elements of the array :- ");
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            selectionSort(arr);
            System.out.print("The array after sorting is :- ");
            display(arr);
            System.out.print("Do you again want to sort an array :- ");
            choice = sc.next().charAt(0);
        }
    }
}
