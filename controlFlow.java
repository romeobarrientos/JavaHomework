import java.util.Scanner;



public class controlFlow {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Please enter your name: ");
            String name = scan.nextLine();
            System.out.println("Hello " + name + "!");
            System.out.println("Would you like to continue the interactive portion?");
            String response = scan.nextLine();
            boolean run = true;
            String redCar, pet, actor, quarterback;
            int petAge, luckyNumber, modelNumber, randomNumber, jerseyNumber;

            if(response.toLowerCase().equals("yes") || response.toLowerCase().equals("y")){
                while(run){
                    System.out.println("Do you have a red car? (yes/no)");
                    redCar = scan.next();
                    System.out.println("What is the name of your favorite pet?");
                    pet = scan.next();        
                    System.out.println("What is the age of your favorite pet?");
                    petAge = scan.nextInt();
                    System.out.println("What is your lucky number?");
                    luckyNumber = scan.nextInt();
                    System.out.println("Do you have a favorite quarterback?");
                    quarterback = scan.next().toLowerCase();
                    if(quarterback.equals("yes")){
                        System.out.println("What is their jersey number?");
                        jerseyNumber = scan.nextInt();
                    }
                    System.out.println("What is the two-digit model year of your car?");
                    modelNumber = scan.nextInt();
                    System.out.println("What is the first name of your favorite actor?");
                    actor = scan.next();
                    System.out.println("Enter a random number between 1 and 50?");
                    randomNumber = scan.nextInt();
                }
            }
        }

    }
}

