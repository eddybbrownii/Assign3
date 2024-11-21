import java.util.Scanner;

public class UserValidation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        {
            System.out.println("What is your username?");
            String userInputUsername =
                    scanner.nextLine();

            System.out.println("what is your password>");
            String userInputPassword =
                    scanner.nextLine();
            System.out.println(userInputUsername);
            System.out.println(userInputPassword);

            if (userInputUsername.equalsIgnoreCase("Eddy") &&
                    userInputPassword.equals("wood")) {
                System.out.println("Welcome " + userInputUsername + ", You have been Validated");
            } else {
                System.out.println("Hello " + userInputUsername + " You have entered invalid credentials, please try again");

            }
        }
    }
}