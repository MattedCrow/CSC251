/**
* This program displays the month class and it's functionalities.
* 09.18.17
* CSC 251 
* @author Matthew 'Melissa' Walsh
*/
package m3_l6_walshmatt;
import javax.swing.*;
import java.util.Scanner;

public class M3_L6_WalshMatt {

    public static void main(String[] args) {
        String input;
        String monthName;
        int monthNum;
        boolean inputCheck = false;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Would you rather enter a number or name? ");
        
        input = keyboard.nextLine().toLowerCase();
        
        while (inputCheck != true) {
            switch (input) {
                case "name":
                    inputCheck = true;
                    System.out.println("You have chosen " + input + ".");
                    break;
                case "number":
                    inputCheck = true;
                    System.out.println("You have chosen " + input + ".");
                    break;
                default:
                    inputCheck = false;
                    System.out.println("Invalid input. Please enter 'name' or " +
                            "'number'.");
                    System.out.print("Would you rather enter a number or name? ");
                    input = keyboard.nextLine();
                    break;
            }
        }
        
        switch (input) {
            case "name":
                try {
                    System.out.print("Please enter the first month: ");
                    monthName = keyboard.nextLine();
                    Month month1 = new Month(monthName);
                    System.out.println("You entered " + monthName + ", " + 
                            "month " + month1.getMonthNumber() + ".");
                    
                    try {
                        Month month2 = new Month(6);
                        
                        String monthName2 = month2.getMonthName();
                        boolean greaterThan = month1.greaterThan(month2);
                        boolean lessThan = month1.lessThan(month2);
                        boolean equals = month1.equals(month2);

                        if (greaterThan == false) {
                            if (lessThan == false) {
                                if (equals == true) {
                                    System.out.println(monthName + " is EQUAL"
                                     + " to " + monthName2 + ".");
                              }
                                else if (equals == false) {
                                    System.out.println("This is actually impossible.");
                                }
                            }
                            else if (lessThan == true) {
                                System.out.println(monthName + " is GREATER than "
                                    + monthName2 + ".");
                            }
                        }
                        else if (greaterThan == true) {
                            System.out.println(monthName + " is LESS than "
                                    + monthName2 + ".");
                }
                    }
                    catch (InvalidNum e) {
                        System.out.println(e.getMessage());
                    }
                }
                catch (InvalidString e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "number":
                try {
                    System.out.print("Please enter the first number: ");
                    monthNum = keyboard.nextInt();
                    Month month1 = new Month(monthNum);
                    System.out.println("You entered " + month1.getMonthName() +
                                ", month " + monthNum + ".");
                    
                    monthName = month1.getMonthName();
                    Month month2 = new Month(6);
                    
                    boolean greaterThan = month1.greaterThan(month2);
                    boolean lessThan = month1.lessThan(month2);
                    boolean equals = month1.equals(month2);

                    String monthName2 = month2.getMonthName();

                    if (greaterThan == false) {
                        if (lessThan == false) {
                            if (equals == true) {
                                JOptionPane.showMessageDialog(null, monthName + " is EQUAL"
                                 + " to " + monthName2 + ".");
                            }
                            else if (equals == false) {
                                JOptionPane.showMessageDialog(null, "This is actually impossible.");
                            }
                        }
                        else if (lessThan == true) {
                            JOptionPane.showMessageDialog(null, monthName + " is GREATER than "
                                + monthName2 + ".");
                        }
                    }
                    else if (greaterThan == true) {
                        JOptionPane.showMessageDialog(null, monthName + " is LESS than "
                                + monthName2 + ".");
                    }
                }
                catch (InvalidNum e) {
                    System.out.println(e.getMessage());
                }
                break;
        }   
    }
}