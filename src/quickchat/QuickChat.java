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

  boolean CheckPin(String pin) {
        if (pin.length() == 4 && pin.matches("\\d+")) {
            return true;
        } else {
            System.out.println("pin must be exactly 4 digits");
            return false;
        }
    }

    boolean CheckEmail(String email) {
        if (email.contains("@") && email.contains(".")) {
            return true;
        } else {
            System.out.println("email is no more than 5 characters long");
            return false;
        }

    }

    boolean CheckId(String ID) {
        if (ID.length() == 13 && ID.matches("\\d+")) {
            return true;
        } else {
            System.out.println("ID must be exactly 13 digits");
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
