 import java.util.Scanner;
 public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  a Number =");
        int a =sc.nextInt();
        System.out.print("Enter b number = ");
        int b=sc.nextInt();
        int temp =a;
        a =b;
        b= temp;
        System.out.println("A =" + a);

        System.out.println("B =" + b);
        sc.close();

        
    }
    
}
