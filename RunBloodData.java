/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package BlookBank;

/**
 *
 * @author jhnnn
 */

import java.util.Scanner;

public class RunBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter blood type of patient: ");
        String input1 = scanner.nextLine().trim().toUpperCase();

        System.out.print("Enter the Rhesus factor (+ or -): ");
        String input2 = scanner.nextLine().trim();

        BloodData bd;
        if (input1.isEmpty() && input2.isEmpty()) {
            bd = new BloodData();
        } else if (isValidBloodType(input1) && isValidRhFactor(input2)) {
            bd = new BloodData(input1, input2);
        } else {
            System.out.println("Error: Invalid blood type or Rhesus factor entered.");
            return;
        }

        bd.display();
    }

    private static boolean isValidBloodType(String bloodType) {
        return bloodType.equals("A") || bloodType.equals("B") || bloodType.equals("AB") || bloodType.equals("O");
    }

    private static boolean isValidRhFactor(String rhFactor) {
        return rhFactor.equals("+") || rhFactor.equals("-");
    }
}

