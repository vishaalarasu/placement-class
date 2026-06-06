import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner hi= new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a=hi.nextInt();
        int b=hi.nextInt();
        System.out.println("Addition: "+(a+b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Subtraction: "+(a-b));
    }
}