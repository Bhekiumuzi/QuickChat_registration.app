/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quickchat;

import java.util.Scanner;

/**
 *
 * @author Student
 */
class QuickChat {

    String Storedusername;
    String Storedpassword;
    String Storedcellphone;
    Scanner inputuser = new Scanner(System.in);

    boolean checkusername(String username) {
            
        if (username.contains("_") && username.length() == 5) {
            return true;
        } else {
            System.out.println("username not correctly formatted");
            return false;
        }
    }

    boolean checkpassword(String password) {
        if (password.contains("Bucks_@1")) {
            return true;
        } else {
            System.out.println("password is not correctly formatted");
            return false;
        }
    }

    boolean checkcellphone(String cellphone) {
        if (cellphone.length() == 12 && cellphone.contains("+27")) {
            return true;
        } else {
            System.out.println("Cell phone number incorrecly formatted or does not contain international ");
            return false;
        }

    }

    void registeruser() {

        System.out.println("\n======REGISTER======");
        System.out.println("Enter username");
        String username = inputuser.nextLine();
        System.out.println("Enter password");
        String password = inputuser.nextLine();
        System.out.println("Enter cellphone");
        String cellphone = inputuser.nextLine();

        if (checkusername(username) && checkpassword(password) && checkcellphone(cellphone)) {

            Storedusername = username;
            Storedpassword = password;
            Storedcellphone = cellphone;

            System.out.println("Registration successful!");
        } else {
            System.out.println("Registration failed.Try again");

        }
    }

    void userlogin() {
        if (Storedusername == null) {
            System.out.println("no user registered yet");
            return;
        }
        int attempts = 3;
        boolean success = false;

        System.out.println("\n======LOGIN======");

        while (attempts > 0 && !success) {
            System.out.println("Enter username");
            String username = inputuser.nextLine();
            System.out.println("Enter password");
            String password = inputuser.nextLine();
            System.out.println("Enter cellphone");
            String cellphone = inputuser.nextLine();

            if (username.equals(Storedusername) && password.equals(Storedpassword) && cellphone.equals(Storedcellphone)) {
                System.out.println("Login successful! welcome back");
                success = true;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Incorrect details.Attempts Left:" + attempts);
                }
            }
        }
        if (!success) {
            System.out.println("Too many failed attempts.Account is locked");
        }
    }

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner enterMenu = new Scanner(System.in);
        QuickChat QuickChat = new QuickChat();
        int choice;
        do {
            System.out.println("\n======MENU======");
            System.out.println("1.Rgister");
            System.out.println("2.Login");
            System.out.println("3.Exit");
            choice = enterMenu.nextInt();
            switch (choice) {
                case 1:
                    QuickChat.registeruser();
                    break;
                case 2:
                    QuickChat.userlogin();
                    break;
                case 3:
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 3);
        {
            enterMenu.close();
        }
    }

}
