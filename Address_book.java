import java.util.Scanner;

public class Address_book_1 {
    Scanner fetch = new Scanner(System.in);





    String first_name;
    String last_name;
    long phone_no;
    String email;
    int zip_code;
    String city;


    Address_book_1(String f_name, String l_name, long phone, String em, int zip, String city) {

        this.first_name = f_name;
        this.last_name = l_name;
        this.phone_no = phone;
        this.email = em;
        this.zip_code = zip;
        this.city = city;

    }



    public String toString(){

        return ("FIRST NAME : "+first_name+"\nLAST NAME : "+last_name+"\nPHONE : "+phone_no+"\nEMAIL : "+email+"\nZIP CODE : "+zip_code+"\nCITY : "+city);
    }


    public static void main(String[] args) {


        Address_book_1 salman = new Address_book_1("Salman", "Khan", 1234567890, "salman@khan.com", 456002, "Mumbai");
        Address_book_1 tom = new Address_book_1("Tom", "Cruise", 789456230, "cruise@usa.com", 123456, "Los Angeles");


        System.out.println(salman);
        System.out.println(tom);

    }



    }
