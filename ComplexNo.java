package JavaProgram;
import java.util.Scanner;
// program no :- 03
public class ComplexNo {
    int real,img;
    public ComplexNo(int real,int img){
        this.real = real;
        this.img = img;
    }
    public void show(){
        System.out.println(real + " + "+img+"i");
    }
    public static ComplexNo add(ComplexNo n1,ComplexNo n2){
        ComplexNo res = new ComplexNo(0,0);
        res.real = n1.real+n2.real;
        res.img = n1.img+n2.img;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the real part of the first no :- ");
        int r1 = sc.nextInt();
        System.out.print("Enter the img part of the first no :- ");
        int i1 = sc.nextInt();
        System.out.print("Enter the real part of the second no :- ");
        int r2 = sc.nextInt();
        System.out.print("Enter the img part of the second no :- ");
        int i2 = sc.nextInt();
        ComplexNo num1 = new ComplexNo(r1,i1);
        System.out.print("The first complex no is :- ");
        num1.show();
        ComplexNo num2 = new ComplexNo(r2,i2);
        System.out.print("The second complex no is :- ");
        num2.show();
        ComplexNo sum = add(num1,num2);
        System.out.print("The sum of num1 and num2 is :- ");
        sum.show();
    }
}
