public class Entry {
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String emailAddress;

    // Setters
    public void setFirstName(String name){
        firstName = name;
    }

    public void setLastName(String name){
        lastName = name;
    }
    
    public void setPhoneNumber(int num){
        phoneNumber = num;
    }

    public void setEmailAddress(String email){
        emailAddress= email;
    }

    // Getters
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

    public String getEmail(){
        return emailAddress;
    }

    // Constructors
    public Entry(){
        firstName = "";
        lastName = "";
        phoneNumber = 0;
        emailAddress = "";
    }

    public Entry(String first, String last, int phone, String email){
        firstName = first;
        lastName = last;
        phoneNumber = phone;
        emailAddress = email;
    }

    public String toString(){
        String result;
        result = "\n************" + "\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nPhone Number: "
         + phoneNumber + "\nEmail: " + emailAddress + "\n************\n";
         return result;
    }
}

