import java.util.Scanner;

public class LCM {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number ");
        int a = sc.nextInt();
        System.out.println("Enter second number ");
        int b = sc.nextInt();
        int smallest = 0;
        int number =0;

        int product = a*b;

        if(a<b){
            smallest = a;
        }
        else{
            smallest = b;
        }

        for(int i=1;i<=smallest;i++){
            if(a%i==0 && b%i==0){
                number = i;
            }
        }
        int LCM = product/number;

        System.out.println(LCM);
    }
}
