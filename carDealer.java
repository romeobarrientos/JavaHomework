import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class carDealer {
    public static void main(String[] args){
        try (//Initialize map and scanner
        Scanner scan = new Scanner(System.in)) {
            Map<String, String> carAndModel = new HashMap<>();

            //Populate Map with Car Make and Model
            carAndModel.put("Honda", "Civic");
            carAndModel.put ("Chevrolet", "Suburban");
            carAndModel.put("Hyundai", "Tucson");
            carAndModel.put("Nissan", "Murano");
            carAndModel.put("Subaru", "Outback");
            carAndModel.put("Kia", "Sportage");

            //Ask customer for car type
            System.out.println("Hello, welcome to Sleezy's Car Dealership! What kind of vehicle are you looking for today?");
            String customerRequest = scan.nextLine();

            //If we carry car brand then print the make and model!
            if(carAndModel.containsKey(customerRequest)){
                System.out.println("Of course, we have a " + customerRequest + " " + carAndModel.get(customerRequest) + "!");
            }
            else{
                System.out.println("Sorry, unfortunately we do not carry that model of car in our dealership!");
            }
        }


    }
}
