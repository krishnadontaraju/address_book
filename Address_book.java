import java.util.Scanner;

public class Address_book {
    Scanner fetch = new Scanner(System.in);

    //Declaring variables
    String first_name;
    String last_name;
    long phone_no;
    String email;
    int zip_code;
    String city;


    //Using constructor to pass arguments
    Address_book(String f_name, String l_name, long phone, String em, int zip, String city) {

        this.first_name = f_name;
        this.last_name = l_name;
        this.phone_no = phone;
        this.email = em;
        this.zip_code = zip;
        this.city = city;

    }


    // Overriding toString Method to display output
    public String toString() {

        return ("FIRST NAME : " + first_name + "\nLAST NAME : " + last_name + "\nPHONE : " + phone_no + "\nEMAIL : " + email + "\nZIP CODE : " + zip_code + "\nCITY : " + city);
    }


    public static void main(String[] args) {

        // Creating salman and tom instances from address_book class
        Address_book salman = new Address_book("Salman", "Khan", 1234567890, "salman@khan.com", 456002, "Mumbai");
        Address_book tom = new Address_book("Tom", "Cruise", 789456230, "cruise@usa.com", 123456, "Los Angeles");

        // printing salman and tom objects
        System.out.println(salman);
        System.out.println(tom);

    }


}
