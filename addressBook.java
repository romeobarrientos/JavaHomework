import java.util.Scanner;
import java.util.ArrayList;
public class addressBook {
    public static void main(String[]args){
        ArrayList<Entry> addressBook = new ArrayList<Entry>();
        addressMenu(addressBook);
    }
        public static void addressMenu(ArrayList<Entry> addressBook){
            try (Scanner scan = new Scanner(System.in)) {
                
                System.out.println("1) Add an entry");
                System.out.println("2) Remove an entry");
                System.out.println("3) Search for a specific entry");
                System.out.println("4) Print Address Book");
                System.out.println("5) Delete Book");
                System.out.println("6) Quit Program");
                System.out.println("Please choose what you'd like to do with the database: ");
                int choice = scan.nextInt();

                switch(choice){
                    case 1:
                        addressMenu(addEntry(addressBook));
                        break;
                    case 2:
                        addressMenu(removeEntry(addressBook));
                        break;
                    case 3: 
                        addressMenu(entrySearch(addressBook));
                    case 4:
                        addressMenu(printBook(addressBook));
                    case 5:
                        addressMenu(deleteBook(addressBook));
                    case 6:
                        System.out.println("\nThanks for using the address book, have a nice day!");
                        System.exit(0);
                    default:
                        System.out.println("Sorry, this is not a valid input! Try again.");
                        addressMenu(addressBook);
                        break;
                }
            }

        }
        public static ArrayList<Entry> addEntry(ArrayList<Entry> addressBook){
            Scanner scan = new Scanner(System.in);
            // Get first name
            System.out.print("First name: ");
            String firstName = scan.next();
            // Get last name
            System.out.print("Last Name: ");
            String lastName = scan.next();
            // Get phone number
            System.out.println("Phone number: ");
            int phoneNumber = scan.nextInt();
            // Get emailAddress address
            System.out.print("Email Address: ");
            String emailAddress = scan.next();
            //Create new entry in addressbook
            Entry entry = new Entry(firstName, lastName, phoneNumber, emailAddress);
            addressBook.add(entry);
            System.out.println("Added entry!");
            return addressBook;
        }
        // Remove an entry by email address
        public static ArrayList<Entry> removeEntry(ArrayList<Entry> addressBook){
            try (Scanner scan = new Scanner(System.in)) {
                System.out.println("Enter the email address: ");
                String emailAddress = scan.next();
                // For loop that passes through address book and compares each entry to user input
                for(int i = 0; i < addressBook.size(); i++){
                    if(addressBook.get(i).getEmail() == emailAddress){
                        System.out.println("Deleted the following entry: ")
                        System.out.print(addressBook.get(i).toString() + "\n");
                        addressBook.remove(i);
                    }
                }
                

            }
            return addressBook;
        }
            // Search address book entries
        public static ArrayList<Entry> entrySearch(ArrayList<Entry> addressBook){
            try (Scanner scan = new Scanner(System.in)) {
                System.out.println("Which entry method would you like to search by?");
                System.out.print("1) First name");
                System.out.println("2) Last name");
                System.out.println("3) Email Address");
                System.out.println("4) Phone Number");
                int entryMethod = scan.nextInt();
                    switch(entryMethod){
                        case 1:
                            System.out.println("Enter the first name: ");
                            String searchFirst = scan.next();
                            
                            break;
                        case 2: 
                            System.out.println("Enter the last name: ");
                            String searchLast= scan.next();
                            break;
                        case 3:
                            System.out.println("Enter the email address: ");
                            String searchEmail = scan.next();

                            break;
                        case 4:
                            System.out.println("Enter a phone number: ");
                            int searchPhone = scan.nextInt();
                            break;
                        default:
                            System.out.println("This is not a valid input, please try again.");
                    }
            }
            return addressBook;
        }
        // Print the address book to console
        public static ArrayList<Entry> printBook(ArrayList<Entry> addressBook){
            if(addressBook.isEmpty()){
                System.out.println("\nThe Address Book is empty!");
                return addressBook;
            }
            else{
                for(int i = 0; i < addressBook.size(); i++){
                    System.out.print(addressBook.get(i).toString());
                }
            }
            return addressBook;
    }
    //Delete the address book
    public static ArrayList<Entry> deleteBook(ArrayList<Entry> addressBook){
        addressBook.clear();
        return addressBook;
        
    }
}