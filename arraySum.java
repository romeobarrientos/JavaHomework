//Used to call the scanner to collect user input
import java.util.Scanner;

//Class that runs problem 1! 
public class arraySum {
    public static void main(String[] args){
        try (
            //Initialize array
        Scanner scan = new Scanner(System.in)) {
            //Scan for size of array
            System.out.println("How many values would you like to hold in your array?");
            int num = scan.nextInt();
            int sum = 0;
            int[] array = new int[num];
            

            //Establish for loop to fill array with values.
            System.out.println("Enter the elements of the array and press enter!");
            for(int i = 0; i < num; i++){
                array[i] = scan.nextInt();
                sum += array[i];
            }
            //Print result of problem 1
            System.out.println("The sum of the array is " + sum + ".\n");
            System.out.println("The output of problem 2 is an error because of several syntax errors in the code. ");

            //Problem 3 variables
            System.out.print("What is the size of the array?: ");
            int size = scan.nextInt();
            System.out.print("What is the power for each element?: ");
            int power = scan.nextInt();
            int[] result = toPower(size, power);

            // Call the function
            System.out.print("The power results of the array are {");
            for(int i = 0; i < size; i++){
                System.out.print(result[i]);
                System.out.print("," + result[i]);
            }
            System.out.println("}");
        }
    }
    //Method for powering each element in given array
    public static int[] toPower(int size, int power){

        int[] powerArray = new int[size];
        for(int i = 0; i < size; i++){
            powerArray[i] = (int) Math.pow(i, power);
        }
            return powerArray;
    }
    
}
