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