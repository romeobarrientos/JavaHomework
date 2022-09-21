import java.lang.Math;
import java.util.Scanner;
public class javaCalculator {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Insert number 1: ");
            int firstVal = scan.nextInt();
            System.out.print("Insert number 2: ");
            int secondVal = scan.nextInt();
            System.out.print("Add / Subtract / Multiply / Divide / Square:  ");
            String command = scan.next().toLowerCase();
            switch(command){
                case "add":
                add(firstVal, secondVal);
                break;
                case "subtract":
                subtract(firstVal, secondVal);
                break;
                case "multiply":
                multiply(firstVal, secondVal);
                break;
                case "divide":
                divide(firstVal, secondVal);
                break;
                case "square":
                square(firstVal, secondVal);
                break;
                default: 
                    System.out.println("Sorry, this is not a valid input.");
            }
        }
    }
    

public static void add(int num1, int num2){
    int sum = num1 + num2;
    System.out.print("The sum of these numbers is " + sum);
}

public static void subtract(int num1, int num2){
    int difference = num1-num2;
    System.out.print("The difference of these numbers is " + difference);
}

public static void multiply(int num1, int num2){
    int product = num1 * num2;
    System.out.print("The product of these numbers is " + product);
}

public static void divide(int num1, int num2){
    int quotient = num1/num2;
    System.out.print("The quotient of these numbers is " + quotient);
}

public static void square(int num1, int num2){
    double sqrt = Math.pow(num1, num2);
    System.out.print("The square of these numbers is " + sqrt);
}

}