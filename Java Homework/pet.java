public class pet {
    // Initialize private variables
    private String name;
    private int age;
    private String location;
    private String type;
    
    // Empty Constructor
    public pet(){

    }

    // All attributes constructor
    public pet(String name, int age, String location, String type){

    }
    // Getters
    public String getName(){return name;}

    public int getAge(){return age;}

    public String type(){return type;}

    // Setters
    public void setName(String N){
        this.name = N;
    }

    public void setAge(int a){
        this.age = a;
    }

    public void setLocation(String l){
        this.location = l;
    }
    

    
}

class romeo {
    private String birthMonth;
    private int age; 
    private String zodiacSign;
    
    // Empty Constructor
    public romeo(){

    }

    //  Constructor using two variables
    public romeo(String birthMonth, int age){

    }
    // Constructor using three variables
    public romeo(String birthMonth, int age, String zodiacSign){

    }

    // Getters
    public String getBirthMonth(String b){return birthMonth;}

    public int getAge(int a) {return age;}

    public String getZodiac(String z){return zodiacSign;}

    // Setters
    public void setAge(int a){
        this.age = a;
    }
    
    public void setBirthMonth(String m){
        this.birthMonth = m;
    }

    public void setZodiacSign(String zz){
        this.zodiacSign = zz;
    }

    public boolean isHappy(){
        return true;
    }

    public String catchPhrase(){
        return "Are we still doing catchphrases? Is that still a thing?";
    }

}

