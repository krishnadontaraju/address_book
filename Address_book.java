import java.util.ArrayList;
import java.util.List;
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


    //Using set Details method to take User input
    public void set_details() {
        System.out.println("GIVE ME THE FIRST NAME :");
        this.first_name = fetch.nextLine();
        System.out.println("GIVE ME THE LAST NAME :");
        this.last_name = fetch.nextLine();
        System.out.println("GIVE ME THE PHONE NO. :");
        this.phone_no = fetch.nextInt();
        System.out.println("GIVE ME THE EMAIL: ");
        this.email = fetch.next();
        System.out.println("GIVE ME THE ZIP CODE");
        this.zip_code = fetch.nextInt();
        System.out.println("GIVE ME THE CITY :");
        this.city = fetch.next();

    }

    // To display output
    public String toString() {

        return ("FIRST NAME : " + first_name + "\nLAST NAME : " + last_name + "\nPHONE : " + phone_no + "\nEMAIL : " + email + "\nZIP CODE : " + zip_code + "\nCITY : " + city);
    }


    public static void main(String[] args) {

        //Creating a list of class Address_book
        List<Address_book> users = new ArrayList<>();
        Address_book salman = new Address_book();
        Address_book tom = new Address_book();
        System.out.println("GIVE ME SALMAN's DETAILS");
        salman.set_details();
        salman.set_details();
        System.out.println("GIVE ME TOM's DETAILS");
        tom.set_details();

        users.add(salman);
        users.add(tom);
        Scanner input = new Scanner(System.in);
        System.out.println("WHAT DO YOU WANT TO DO \n" + "1.ADD DETAILS\n 2.EXIT");
        int choice = input.nextInt();
        //using switch make appropraite choices
        switch (choice) {
            //Adding the user case
            case 1:

                Address_book steve = new Address_book();
                steve.set_details();
                users.add(steve);
                System.out.println("Added THE USER :");
                System.out.println(users);


            default:
                break;

        }


    }


}
