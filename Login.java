import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        // Stored username and password
        String storedUsername = "admin";
        String storedPassword = "1234";

        Scanner sc = new Scanner(System.in);

        int attempts = 0;     // counter variable
        boolean loggedIn = false;

        // allow only 3 attempts
        while (attempts < 3 && !loggedIn) {

            System.out.print("Enter username: ");
            String user = sc.nextLine();

            System.out.print("Enter password: ");
            String pass = sc.nextLine();

            // check using logical AND
            if (user.equals(storedUsername) && pass.equals(storedPassword)) {
                System.out.println("Login Successful!!!");
                loggedIn = true;
            } else {
                attempts++;   // increase counter
                System.out.println("Wrong credentials !!!S");
                System.out.println("Attempts left: " + (3 - attempts));
            }
        }

        // if 3 attempts finished
        if (!loggedIn) {
            System.out.println("Account Locked !!!");
        }

        sc.close();
    }
}
