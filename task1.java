package interntasks;

import java.io.Console;

public class task1 {

    public static void main(String[] args) {

        Console console = System.console();

        if (console == null) {
            System.out.println("No console available");
            return;
        }

        String validUsername = "admin";
        String validPassword = "hello";

        String username = console.readLine("Enter username: ");

        char[] passwordArray = console.readPassword("Enter password: ");

        String password = new String(passwordArray);

        if (username.equals(validUsername) && password.equals(validPassword)) {
            System.out.println("Welcome " + validUsername);
        } else {
            System.out.println("Incorrect credentials");
        }
    }
}