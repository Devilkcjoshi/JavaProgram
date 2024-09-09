package JavaProgram;
import java.util.Scanner;
// program no :- 04

public class SimpleInterest {
    int P;
    float R;
    float T;
    public SimpleInterest(int P,float R,float T){
        this.P = P ;
        this.R = R;
        this.T = T;
    }
    public void simpleInterest(){
        System.out.println("The Simple interest is :- "+(P*R*T)/100);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount :- ");
        int P = sc.nextInt();
        System.out.print("Enter the Rate of the interest :- ");
        float R = sc.nextFloat();
        System.out.print("Enter the time :- ");
        float T = sc.nextFloat();
        SimpleInterest obj = new SimpleInterest(P,R,T);
        obj.simpleInterest();
    }
}
