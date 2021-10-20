import java.util.*; // * notation to reference the scanner and random classes since they are in the same package

public class User {

    public static void main (String[] args){

       String firstName;

       String lastName;

       // create a new scanner to collect user input 
       Scanner userInput = new Scanner(System.in);

       // Asks user for their first name
       System.out.println("Enter your Firstname: "); 

       // To collect and store firstname of the user's input on the line
       firstName = userInput.nextLine();

       System.out.println("You entered: " + firstName); 

       // Asks user for their lastname
       System.out.println("Now enter your Last name: ");

       // To collect and store lastname of the user's input
       lastName = userInput.nextLine();

       System.out.println("You entered: " + lastName); 
       // Prints out user input of their last name they've entered

       System.out.println("Your name is : " + firstName + " " + lastName); // Contain user fullname


        char userfirstInitial = firstName.charAt(0);// Contain letter of user's first name

        System.out.println("The first Initial of your firstname is: " + userfirstInitial ); 
        // Print a string composed of the first letter of the user’s first name

        if (lastName != null && lastName.length() > 5) {
            System.out.println("First five characters of your lastname: " + lastName.substring(0, 5)); 
            System.out.println(userfirstInitial + lastName.substring(0, 5));
            // Prints first five characters of the user’s last name
        }else {
            System.out.println("Sorry! Last name does not contain up to five character.");
            // If username is not up to five characters elae condition prompt this error
        }

        Random rand = new Random(); // To creates random numbers from 10 to 99

        int num1 = 10;

        num1 = rand.nextInt(90) + 10;
        System.out.println("From 10 to 99: " + num1);
        // followed by a random number in the range 10 to 99

        System.out.println("Produces random numbers from 10 to 99: " + num1);
        System.out.println("Username: " + userfirstInitial + lastName.substring(0, 5) + num1);


    }
}
