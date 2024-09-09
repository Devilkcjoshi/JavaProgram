package JavaProgram;
// Program no :- 05;

public class BiggestNumber {
    public static int bigOfThree(int a,int b,int c){
        if(a>b){
            if(a>c){
                return a;
            }
            else{
                return c;
            }
        }
        else {
            if(b>c){
                return b;
            }
            else {
                return c;
            }
        }
    }
    public static int bigOfFour(int a,int b,int c,int d){
        if(a>b){
            if(a>c){
                if(a>d){
                    return a;
                }
                else {
                    return d;
                }
            }
            else{
                if(c>d){
                    return c;
                }
                else{
                    return d;
                }
            }
        }
        else {
            if(b>c){
                if(b>d){
                    return b;
                }
                else{
                    return d;
                }
            }
            else{
                if(c>d){
                    return c;
                }
                else{
                    return d;
                }
            }
        }
    }
    public static void main(String[] args) {
        int a = 754,b = 604, c = 106,d = 96;
        System.out.println("The biggest of these number is :- "+bigOfThree(a,b,c));
        System.out.println("The biggest of these four number is : - "+bigOfFour(a,b,c,d));
    }
}
