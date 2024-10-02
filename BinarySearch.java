package JavaProgram;
import java.util.Scanner;
// Program no :- 38

public class BinarySearch {
    public static void display(int[] arr){
        for(int i:arr){
            System.out.print(i+"  ");
        }
        System.out.println();
    }
    public static int linearSearch(int[] arr,int element){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr,int element){
        int low = 0,high = arr.length-1;
        int mid;
        while(low <= high){
            mid = (low+high)/2;
            if(arr[mid] == element){
                return mid;
            }
            if(arr[mid]<element){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void bubbleSort(int[] arr){
        int issort = 0;
        for(int i=0; i<arr.length; i++){
            System.out.println("This is pass no :- "+(i+1));
            for(int j=0;j<(arr.length-1-i); j++){
                if(arr[j] > arr[j+1]){
                    arr[j] = arr[j]+arr[j+1];
                    arr[j+1] = arr[j]-arr[j+1];
                    arr[j] = arr[j]-arr[j+1];
                    issort = issort+1;
                }
            }
            if(issort>0){
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of the array :- ");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array :- ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int element;
        char choice = 'y';
        while(choice != 'n'){
            System.out.print("Which search do you want to apply to search binary or linear :- ");
            sc.nextLine();
            String type = sc.nextLine();
            if(type.equalsIgnoreCase("binary")){
                bubbleSort(arr);
                System.out.println("sorted array :- ");
                display(arr);
                System.out.print("Enter the element you want to search in the array :- ");
                element = sc.nextInt();
                if(binarySearch(arr,element) == -1){
                    System.out.println("The element is not found in the array.");
                }
                else{
                    System.out.println("The element is found in the index :- "+(binarySearch(arr,element)+1));
                }
            }
            else if(type.equalsIgnoreCase("linear")){
                System.out.print("Enter the element you want to search in the array :- ");
                element = sc.nextInt();
                if(linearSearch(arr,element) == -1){
                    System.out.println("The element is not present in the given array.");
                }
                else{
                    System.out.println("The element is present in the index :- "+(linearSearch(arr,element)+1));
                }
            }
            else{
                System.out.println("Enter a valid input.");
            }
            System.out.print("Do you again want to search a element if yes(type anything) else type n :- ");
            choice = sc.next().charAt(0);
        }
    }
}