import java.util.Scanner;
public class loopsMaps{
    public static void main(String[] args){
        //Initialize variables
        int sum = 0;
        int product = 1;
        int[] list = new int[5];

        //Get input from user
        try (Scanner scan = new Scanner(System.in)) {
         System.out.println("Enter 5 numbers please!");

            
            

            //Apply values to sum and product
            for(int i = 0; i < list.length; i++){
                list[i] = scan.nextInt();
                sum += list[i];
                product *= list[i];
            }

            //Highest and lowest value used in if statement below
            int largest = list[0];
            int smallest = list[0];

            for(int i = 0; i < list.length; i++){
                 //Sort array to find smallest and largest values.
                
                if (list[i] > largest)
                largest = list[i];
            if (list[i] < smallest)
                smallest = list[i];

            }
                //Output results
            System.out.println("The sum of the array is " + sum);
            System.out.println("The product of the array is " + product);
            System.out.println("The largest element in the array is " + largest);
            System.out.println("The smallest element in the array is " + smallest);
               
    }

           
            }
            
        }

    
