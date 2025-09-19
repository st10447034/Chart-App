package chartapp;

import java.util.Scanner;

public class Mainlogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RegistrationLogin2 login = new RegistrationLogin2();

        // Step 1: Registration
        System.out.println("=== User Registration ===");
        System.out.print("Enter a username: ");
        String username = input.nextLine();

        System.out.print("Enter a password: ");
        String password = input.nextLine();

        System.out.print("Enter a South African cell phone number (+27 73 534 5576): ");
        String cell = input.nextLine();

        String regMessage = login.registerUser(username, password, cell);
        System.out.println(regMessage);

        // Only allow login if registration was successful
        if (regMessage.equals("User registered successfully!")) {
            System.out.println("\n=== Login ===");
            System.out.print("Enter first name: ");
            String firstName = input.nextLine();

            System.out.print("Enter last name: ");
            String lastName = input.nextLine();

            System.out.print("Enter username: ");
            String loginUser = input.nextLine();

            System.out.print("Enter password: ");
            String loginPass = input.nextLine();

            String loginMessage = login.returnLoginStatus(loginUser, loginPass, firstName, lastName);
            System.out.println(loginMessage);
        }

        input.close();
    }

    private static class RegistrationLogin2 {

        public RegistrationLogin2() {
        }

        private String registerUser(String username, String password, String cell) {
            throw new UnsupportedOperationException("Not supported."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private String returnLoginStatus(String loginUser, String loginPass, String firstName, String lastName) {
            throw new UnsupportedOperationException("Not supported."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}