package Task1;

public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    private static int counter = 0;

    public Customer(String firstName, String lastName, String userName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;

        counter++; // her tæller jeg op for hver kunde
        this.id = counter; // Hvert id får en værdi

    }
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getUserName(){
        return userName;
    }

    public int getId(){
        return id;
    }

    public int getCounter(){
        return counter;
    }

    public void  setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName (String lastName){
        this.lastName = lastName;
    }

    public void setUserName (String userName){
        this.userName= userName;
    }
//ID og counter får ikke settere, da de skal styres af system og derved er fastlåste
    public String toString(){
        return "Customer ID: " + id  + ", "+ "Name: " + firstName+ " " +
                lastName + ", " + "User ID: "  + userName + "\n";

    }
}
