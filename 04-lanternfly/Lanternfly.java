
/**
 * Write a description of class LaternFly here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Lanternfly
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("The lanternfly is an invasive species and ");
        System.out.println("is a threat to our trees and plants.");
        
        System.out.print("How many did you squash this summer? ");
        int num = input.nextInt();
        
        
        if (num <+ 1) {
            System.out.println("You will do better next time");
        } // end if statement
        else {
            System.out.println("Thanks for doing your part");
        } // end else statement
        
    } // end main method
    
} // end class