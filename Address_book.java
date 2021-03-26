import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Address_book {
    Scanner fetch = new Scanner(System.in);

    //Declare the variables
    String first_name;
    String last_name;
    long phone_no;
    String email;
    int zip_code;
    String city;


    //Using set method to assign variables from the user
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

    //Display output
    public String toString() {

        return ("FIRST NAME : " + first_name + "\nLAST NAME : " + last_name + "\nPHONE : " + phone_no + "\nEMAIL : " + email + "\nZIP CODE : " + zip_code + "\nCITY : " + city);
    }


    public void change_details() {
        System.out.println("WHICH DETAiLS DO YOU WAnT TO CHANGE ? :");
        System.out.println("1.FIRST NAME\n2.LAST NAME\n3.PHONE NO.\n4.EMAIL\n5.ZIP CODE\n6.CITY\n7.EXIT");
        int change_choice = fetch.nextInt();
        switch (change_choice) {

            case 1://changes the First name
                System.out.println("CHANGE THE FIRST NAME TO :");//Allowing user to change First name
                String changer_fname = fetch.next();
                this.first_name = changer_fname;
                break;
            case 2://changes the last name
                System.out.println("CHANGE THE LAST NAME TO :");//Allowing user to change Last name
                String changer_lname = fetch.next();
                this.last_name = changer_lname;
                break;
            case 3://changes the Phone no.
                System.out.println("CHANGE THE PHONE NUMBER TO :");//Allowing user to change Contact number
                int changer_phone = fetch.nextInt();
                this.phone_no = changer_phone;
                break;

            case 4://changes the Email
                System.out.println("CHANGE THE EMAIL ID TO :");//Allowing user to change the email
                String changer_email = fetch.next();
                this.email = changer_email;
                break;


            case 5://changes the ZIP code
                System.out.println("CHANGE THE ZIP CODE TO :");//Allowing user to change the Zip code
                int changer_zip = fetch.nextInt();
                this.zip_code = changer_zip;
                break;

            case 6://changes the City
                System.out.println("CHANGE THE CITY TO :");//Allowing user to change the City
                String changer_city = fetch.next();
                this.city = changer_city;
                break;

            default:
                break;
        }

    }


    //Using get name method to check with user's input
    public String getName() {

        return first_name;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Creating a list
        List<Address_book> users = new ArrayList<>();

        Address_book salman = new Address_book();//creating salman object
        Address_book tom = new Address_book();// creating tom object
        System.out.println("GIVE ME SALMAN's DETAILS");
        salman.set_details();
        salman.set_details();
        System.out.println("GIVE ME TOM's DETAILS");
        tom.set_details();

        users.add(salman);
        users.add(tom);

        System.out.println("WHAT DO YOU WANT TO DO\n" +
                "1.ADD DETAILS\n 2.EXIT");
        int choice = input.nextInt();


        switch (choice) {

            case 1://Adding entries to the book
                System.out.println("HOW MANY USERS DO YOU WANT TO ADD");
                int user_choice = input.nextInt();
                for (int i = 0; i < user_choice; i++) {
                    Address_book person = new Address_book();// Using person instance of Address_book class as reference object
                    person.set_details();
                    users.add(person);
                    System.out.println(person.toString());
                }

                System.out.println("WHAT NEXT DO YOU WANT TO DO\n1.EDIT THE DETAILS\n2.DELETE USER\n3.EXIT");
                int choice2 = input.nextInt();
                switch (choice2) {


                    case 1:
                        System.out.println(users);
                        System.out.println("WHOSE DETAILS DO YOU WANT TO EDIT");//asking user whose details he wants to change
                        String store = input.next();
                        for (Address_book i : users) {//Iterating until we find the name whose details user wants to change

                            if (i.getName().equals(store)) {

                                i.change_details();//calling change method to change details

                            }

                        }
                        System.out.println(users);// printing the changed details
                        break;
                    case 2:
                        System.out.println(users);//if user want to delete the added details
                        System.out.println("WHOSE DETAILS DO YOU WANT TO DELETE");
                        String delete_store = input.next();
                        for (Address_book i : users) {//iterating through the arraylist until finds user's input

                            if (i.getName().equals(delete_store)) {

                                users.remove(i);//Using remove method to delete entry

                            } else
                                System.out.println("WRONG INPUT");

                        }
                        System.out.println(users);


                    default:
                        break;
                }
                break;


            default:
                break;


        }


        System.out.println("THE FINAL LIST OF USERS IS");
        System.out.println(users);

    }

}
