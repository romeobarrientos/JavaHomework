import java.util.Scanner;
import java.util.Random;
class AsciiChars 
{
    // Method that prints valid numbers
  public static void printNumbers()
  {
    System.out.print("\nThe valid numbers are: ");
    for(int i = 0; i < 10; i++){
        System.out.print(i + " ");
    }
  }
  // Method that prints valid lowercase characters
  public static void printLowerCase()
  {
    System.out.print("\nThe valid lowercase letters are ");
    for(char ch = 97; ch <= 122; ch++){
        System.out.print(ch + " ");
    }
  }
  // Method that prints valid uppercase characters
  public static void printUpperCase()
  {
    System.out.print("\nThe valid uppercase letters are " );
    for(char ch = 65; ch <= 90; ch++){
        System.out.print(ch + " ");
    }
    System.out.println("\n");
  }
}

public class controlFlow {
    public static void main(String[] args){
        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();
        // Declare Scanner and prompt user for name
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Please enter your name: ");
            String name = scan.nextLine();
            System.out.println("Hello " + name + "!");
            System.out.println("Would you like to continue the interactive portion?");
            String response = scan.nextLine();
            // Initialize values used in survey
            String redCar, pet, actor, quarterback, newGen;
            int petAge, luckyNumber, modelNumber, randomNumber, magicBall;
            int jerseyNumber = 0;
            // Check user response for starting survey
            if(response.toLowerCase().equals("yes") || response.toLowerCase().equals("y")){
                //do-while loop that calls code until user decides to stop survey
                do{
                    // Ask user questions
                    System.out.println("Do you have a red car? (yes/no)");
                    redCar = scan.next();
                    System.out.println("What is the name of your favorite pet?");
                    pet = scan.next();        
                    System.out.println("What is the age of your favorite pet?");
                    petAge = Math.abs(scan.nextInt());
                    System.out.println("What is your lucky number?");
                    luckyNumber = Math.abs(scan.nextInt());
                    System.out.println("Do you have a favorite quarterback?");
                    quarterback = scan.next().toLowerCase();
                    // If statement to confirm jersey number
                    if(quarterback.equals("yes")){
                        System.out.println("What is their jersey number?");
                        jerseyNumber = Math.abs(scan.nextInt());
                    }
                    System.out.println("What is the two-digit model year of your car?");
                    modelNumber = Math.abs(scan.nextInt());
                    System.out.println("What is the first name of your favorite actor?");
                    actor = scan.next();
                    System.out.println("Enter a random number between 1 and 50?");
                    randomNumber = Math.abs(scan.nextInt());
                    // Declare random value
                    Random rand = new Random();
                    // Initialize 3 random numbers
                    int random1 = Math.abs(rand.nextInt(50));
                    int random2 = rand.nextInt(50);
                    int random3 = rand.nextInt(50);
                    // if statement that determines if jersey number exists
                    if(jerseyNumber != 0){
                        magicBall = Math.abs(jerseyNumber * random1);
                    }
                    else {
                        magicBall = Math.abs(luckyNumber * random1);
                    }
                    // if statement that checks to see if magic Ball number is greater than 75
                    while(magicBall > 75){
                        magicBall -= 75;
                    }
                    int lotNumber1, lotNumber2, lotNumber3, lotNumber4, lotNumber5;
                    lotNumber1 = modelNumber + luckyNumber;
                    while(lotNumber1 > 65){
                        lotNumber1 -= 65;
                    }
                    lotNumber2 = petAge + modelNumber;
                    while(lotNumber2 > 65){
                        lotNumber2 -= 65;
                    }
                    lotNumber3 = 42;
                    while(lotNumber3 > 65){
                        lotNumber3 -= 65;
                    }
                    lotNumber4 = (int)actor.charAt(0);
                    while(lotNumber4 > 65){
                        lotNumber4 -= 65;
                    }
                    lotNumber5 = (int)pet.charAt(2);
                    while(lotNumber5 > 65){
                        lotNumber5 -= 65;
                    }
                    System.out.println("Lottery numbers: " + lotNumber1 + "," + lotNumber2 + "," + lotNumber3 + "," + lotNumber4 + "," +
                     lotNumber5 + " Magic ball: " + magicBall + " ");
                    System.out.println("Would you like to generate another set of numbers? ");
                    newGen = scan.next();
                } while(newGen.equals("yes"));
                System.out.println("Thank you for completing this survey! Have a nice day :)");
            }
        }

    }
}

