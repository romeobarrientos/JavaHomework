public class Entry {
    private String firstName;
    private String lastName;
    private long phoneNumber;
    private String emailAddress;

    public Entry() {
        
    }


    public Entry(String firstName, String lastName, long phoneNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    //getters
    public String getFirstName() {
        return firstName;
    }




    public String getLastName() {
        return lastName;
    }




    public long getPhoneNumber() {
        return phoneNumber;
    }




    public String getEmailAddress() {
        return emailAddress;
    }




    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }




    public void setLastName(String lastName) {
        this.lastName = lastName;
    }




    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }




    public String toString(){
        String result;
        result = "\n************" + "\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nPhone Number: "
         + phoneNumber + "\nEmail: " + emailAddress + "\n************\n";
         return result;
    }
}

