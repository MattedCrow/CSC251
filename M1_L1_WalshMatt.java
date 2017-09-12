/**
* This program calculates the miles per gallon based on user input
* 08.23.17
* CSC 251 Lab 1 - Miles per Gallon
* @author Matthew 'Melissa' Walsh
*/
package m1_l1_walshmatt;
import javax.swing.JOptionPane;

public class M1_L1_WalshMatt {

    public static void main(String[] args) {
        double miles;     // Placeholder for miles driven
        double gallons;   // Placeholder for gallons used
        double mpg;       // Miles per gallon
        String input;     // Placeholder for user-given input
        
        
        // Get miles driven
        JOptionPane.showMessageDialog(null, "Hello! We are going to calculate your miles per gallon!");
        input = JOptionPane.showInputDialog("How many miles did you drive?");
    	miles = Double.parseDouble(input);
        
        // Get number of gallons of fuel
        input = JOptionPane.showInputDialog("How many gallons of gas did you use?");
    	gallons = Double.parseDouble(input);
        
        // Calculate the miles-per-gallon
        mpg = miles/gallons;
        
        // Display the miles-per-gallon
        JOptionPane.showMessageDialog(null, String.format("You get roughly %,.3f miles per gallon!", mpg));
        
        // Exit the program
        System.exit(0);
    }
    
}
