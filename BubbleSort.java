package JavaProgram;
import java.util.Scanner;
// Program no :- 37;

public class BubbleSort {
    public static void arrayInput(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter he elements of the array :- ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }
    public static void display(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void bubbleSort(int[] arr){
        int temp,issorted = 1;
        for(int i=0; i<(arr.length-1);i++){
            System.out.println("This is our pass no :- "+(i+1));
            for(int j=0; j<(arr.length-i-1); j++){
                if(arr[j] > arr[j+1]){
                    issorted = 0;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(issorted == 1){
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice = 'y';
        while(choice != 'n') {
            int[] arr;
            System.out.print("Enter the size of the array :- ");
            int size = sc.nextInt();
            arr = new int[size];
            arrayInput(arr);
            bubbleSort(arr);
            display(arr);
            System.out.print("do you want to continue if yes (type anything) or no(type n) :- ");
            choice = sc.next().charAt(0);
        }
    }
}
