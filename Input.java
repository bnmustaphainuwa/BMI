import java.util.Scanner;

public class Input {
    //main method
    public static void main(String[] args) {
    //create an object of the class Patient
    Patient patient = new Patient();
    //create a Scanner
    Scanner input = new Scanner(System.in);
    //promot the user to  enter his  first name
    System.out.println("Please Enter Your First Name: ");
    String first_name = input.nextLine();
    patient.setFirstName(first_name);
    //promot the user to enter his last name
    System.out.println("Please Enter Your Last Name: " );
    String last_name = input.nextLine();
    patient.setLastName(last_name);
    //prompt the user to enter his id
    System.out.println("Enter Your ID: ");
    long id = input.nextLong();
    patient.setId(id);
    //prompt the user to enter his height
    System.out.println("Enter Your Weight: ");
    double height = input.nextDouble();
    patient.setHeight(height);
    //prompt the user to enter his weight
    System.out.println("Enter your Weight: ");
    double weight = input.nextDouble();
    patient.setWeight(weight);
    }
}
