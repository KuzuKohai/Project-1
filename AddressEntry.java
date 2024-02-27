package address.data;

public class AddressEntry {

    // variables of AddressEntry

    public AddressEntry(){  // default constructor

    };

    private String firstName; //first name of the entry

    private String lastName; //last name of the entry

    private String street; //street name of the entry

    private String city; //city name of the entry

    private String state; //state name of the entry

    private int zip; //zip code of the entry

    private String telephone; //phone number of the entry

    private String email; //email of the entry

    //this sets the variables into the AddressEntry object
    public AddressEntry(String firstName, String lastName, String street, String city, String state, int zip, String telephone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.telephone = telephone;
        this.email = email;
    }

    // this returns the string of the entry's information
    public String toString() {
        return  firstName +" "+ lastName + "\n" +
                street + "\n" +
                city +" "+ state +" "+ zip + "\n" +
                email + "\n" +
                telephone;

    }

    /**HERE ARE THE GETTERS OF THIS CLASS**/
    public String getFirstName() { //gets the first name
        return firstName;
    }

    public String getLastName() { //gets the last name
        return lastName;
    }

    public String getStreet() { //gets the street name
        return street;
    }

    public String getCity() { //gets the city name
        return city;
    }

    public String getState() { //gets the state name
        return state;
    }

    public int getZip() { //gets the zip code
        return zip;
    }

    public String getTelephone() { //gets the phone number
        return telephone;
    }

    public String getEmail() { //gets the email address
        return email;
    }



    /**HERE ARE THE SETTERS OF THE CLASS**/
    public void setFirstName(String firstName) { //sets  first name
        this.firstName = firstName;
    }

    public void setLastName(String lastName) { //sets the last name
        this.lastName = lastName;
    }

    public void setStreet(String street) { //sets the street name
        this.street = street;
    }

    public void setCity(String city) { //sets the ciy name
        this.city = city;
    }

    public void setState(String state) { //sets the state name
        this.state = state;
    }

    public void setZip(int zip) { //sets the zip code
        this.zip = zip;
    }

    public void setTelephone(String telephone) { //sets the telephone number
        this.telephone = telephone;
    }

    public void setEmail(String email) { //sets the email address
        this.email = email;
    }
}
